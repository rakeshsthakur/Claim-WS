package com.mitchell.claim.business.utils;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.mitchell.claim.business.wsdl.CauseOfLossCode;
import com.mitchell.claim.business.wsdl.LossInfoType;
import com.mitchell.claim.business.wsdl.MitchellClaimType;
import com.mitchell.claim.business.wsdl.StatusCode;
import com.mitchell.claim.business.wsdl.VehicleInfoType;
import com.mitchell.claim.business.wsdl.VehicleListType;
import com.mitchell.claim.model.Claim;
import com.mitchell.claim.model.Vehicles;

public class DomainUtils {

	public static MitchellClaimType toXMLClaim(Claim claim) {
		MitchellClaimType mitchellClaimType = new MitchellClaimType();
		LossInfoType lossInfoType = new LossInfoType();
		VehicleInfoType vehicleInfoType = new VehicleInfoType();
		VehicleListType vehicleListType = new VehicleListType();

		mitchellClaimType.setClaimNumber(claim.getClaimNumber());
		mitchellClaimType.setClaimantFirstName(claim.getFirstName());
		mitchellClaimType.setClaimantLastName(claim.getLastName());
		XMLGregorianCalendar xmlCalendar = toXmlGregotian(claim.getLossDate());

		mitchellClaimType.setLossDate(xmlCalendar);
		mitchellClaimType.setStatus(StatusCode.valueOf(claim.getStatus()));
		mitchellClaimType.setAssignedAdjusterID(claim.getAssignedAdjusterID());

		// LossInfo details
		lossInfoType.setCauseOfLoss(CauseOfLossCode.fromValue(claim.getLossInfo().getCauseOfLoss()));
		lossInfoType.setLossDescription(claim.getLossInfo().getLossDescription());
		lossInfoType.setReportedDate(toXmlGregotian(claim.getLossInfo().getReportedDate()));

		for (Vehicles currentVehicleInfo : claim.getVehicles()) {
			vehicleInfoType.setDamageDescription(currentVehicleInfo.getDamageDescription());
			vehicleInfoType.setEngineDescription(currentVehicleInfo.getEngineDescription());
			vehicleInfoType.setExteriorColor(currentVehicleInfo.getExteriorColor());
			vehicleInfoType.setLicPlate(currentVehicleInfo.getLicPlate());
			vehicleInfoType.setLicPlateExpDate(toXmlGregotian(currentVehicleInfo.getLicPlateExpDate()));
			vehicleInfoType.setLicPlateState(currentVehicleInfo.getLicPlateState());
			vehicleInfoType.setMakeDescription(currentVehicleInfo.getMakeDescription());
			vehicleInfoType.setMileage(currentVehicleInfo.getMilage());
			vehicleInfoType.setModelDescription(currentVehicleInfo.getModelDescription());
			vehicleInfoType.setModelYear(currentVehicleInfo.getModelYear());
			vehicleInfoType.setVin(currentVehicleInfo.getVin());
			vehicleListType.getVehicleDetails().add(vehicleInfoType);
		}
		mitchellClaimType.setLossInfo(lossInfoType);
		mitchellClaimType.setVehicles(vehicleListType);
		return mitchellClaimType;
	}

	public static XMLGregorianCalendar toXmlGregotian(Date date) {
		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(date);
		XMLGregorianCalendar xmlCalendar = null;
		try {
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
		} catch (Exception e) {
			System.out.println(e);
		}
		return xmlCalendar;
	}
	
	public static Date toDate(XMLGregorianCalendar xmlGreogDate) {
		return xmlGreogDate.toGregorianCalendar().getTime();
	}

}