package com.mitchell.claim.business.process;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mitchell.claim.business.dao.IClaimDao;
import com.mitchell.claim.business.utils.DomainUtils;
import com.mitchell.claim.business.wsdl.CreateClaimResponse;
import com.mitchell.claim.business.wsdl.MitchellClaimType;
import com.mitchell.claim.business.wsdl.VehicleInfoType;
import com.mitchell.claim.model.Claim;
import com.mitchell.claim.model.LossInfo;
import com.mitchell.claim.model.Vehicles;

@Component
public class CreateClaimBP extends Exception implements IGenericBusinessProcess<MitchellClaimType, CreateClaimResponse> {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IClaimDao createClaimDaoImpl;

	@Override
	public CreateClaimResponse execute(MitchellClaimType input) throws Exception {

		Claim claim = new Claim();
		LossInfo lossInfo = new LossInfo();
		Vehicles vehicles = new Vehicles();

		List<Vehicles> vehiclesList = new ArrayList<Vehicles>();
		
		if (input.getClaimNumber() == null || input.getClaimNumber() == "") {
			throw new Exception("Claim Number cannot be empty");
		}
		
		if (input.getClaimNumber() == null || input.getClaimNumber() == "") {
			throw new Exception("Claim Number cannot be empty");
		}
		
		claim.setClaimNumber(input.getClaimNumber());
		claim.setClaimNumber(input.getClaimNumber());
		claim.setFirstName(input.getClaimantFirstName());
		claim.setLastName(input.getClaimantLastName());
		claim.setAssignedAdjusterID(input.getAssignedAdjusterID());
		claim.setStatus(input.getStatus().value());
		claim.setLossDate(DomainUtils.toDate(input.getLossDate()));

		// LossInfoModel
		lossInfo.setCauseOfLoss(input.getLossInfo().getCauseOfLoss().value());
		lossInfo.setLossDescription(input.getLossInfo().getLossDescription());
		lossInfo.setReportedDate(DomainUtils.toDate(input.getLossInfo().getReportedDate()));

		List<VehicleInfoType> vehicleInfo = (List<VehicleInfoType>) input.getVehicles().getVehicleDetails();
		for (VehicleInfoType b : vehicleInfo) {
			if(b.getModelYear() ==0){
				throw new Exception("Model year cannot be empty");
			}
			vehicles.setDamageDescription(b.getDamageDescription());
			vehicles.setEngineDescription(b.getEngineDescription());
			vehicles.setExteriorColor(b.getExteriorColor());
			vehicles.setLicPlate(b.getLicPlate());
			vehicles.setLicPlateExpDate(DomainUtils.toDate(b.getLicPlateExpDate()));
			vehicles.setLicPlateState(b.getLicPlateState());
			vehicles.setMakeDescription(b.getMakeDescription());
			vehicles.setMilage(b.getMileage());
			vehicles.setModelDescription(b.getModelDescription());
			vehicles.setModelYear(b.getModelYear());
			vehicles.setVin(b.getVin());
			vehicles.setClaim(claim);
			vehiclesList.add(vehicles);
		}

		claim.setLossInfo(lossInfo);
		claim.setVehicles(vehiclesList);
		Claim claimCreatedResponse = createClaimDaoImpl.createClaim(claim);
		if (claimCreatedResponse != null) {
			return respond(claimCreatedResponse);
		}

		return null;
	}


	private CreateClaimResponse respond(Claim claim) {

		CreateClaimResponse createClaimResonse = new CreateClaimResponse();

		MitchellClaimType mitchellClaimType = DomainUtils.toXMLClaim(claim);

		createClaimResonse.setClaimCreatedResponse(mitchellClaimType);

		return createClaimResonse;
	}

}
