package com.mitchell.claim.business.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mitchell.claim.model.Claim;
import com.mitchell.claim.model.LossInfo;
import com.mitchell.claim.model.Vehicles;

public class CreateClaimTestDao extends AbstractTestClass {

	String claimNumber = "test4";
	String firstName = "Rakesh";
	String lastName = "Thakur";
	Long assigned_id = 1311L;
	Date lossDate = new Date();

	// Goes To Loss class
	String causeOfLoss = "Collision";
	Date ReportedDate = new Date();
	String lossDesc = "Acc";

	private Integer modelYear = 13456;

	private String makeDescription = "Acura";

	private String modelDescription = "2016";

	private String engineDescription = "v6";

	private String exteriorColor = "Black";

	private String vin = "asdfasdf45457487451";

	private String licPlate = "RRaksa564";

	private String licPlateState = "CA";

	private Date licPlateExpDate = new Date();

	private String damageDescription = "dome dents";

	private Integer mileage = 1000;

	@Autowired
	private IClaimDao claimDao;

	@Test
	public void createClaimTest() {
		Claim claim = new Claim();

		LossInfo lossInfo = new LossInfo();

		Vehicles vehicleInfo = new Vehicles();
		List<Vehicles> vehiclesInfo = new ArrayList<>();

		claim.setClaimNumber(claimNumber);
		claim.setFirstName(firstName);
		claim.setLastName(lastName);
		claim.setAssignedAdjusterID(assigned_id);
		claim.setLossDate(lossDate);
		lossInfo.setCauseOfLoss(causeOfLoss);
	
		// Goes in info class
		lossInfo.setLossDescription(lossDesc);
		lossInfo.setReportedDate(new Date());
		claim.setLossInfo(lossInfo);

		// for (Vehicles vehicleInfo : vehiclesInfo) {
		vehicleInfo.setDamageDescription(damageDescription);
		vehicleInfo.setEngineDescription(engineDescription);
		vehicleInfo.setExteriorColor(exteriorColor);
		vehicleInfo.setLicPlate(licPlate);
		vehicleInfo.setLicPlateExpDate(licPlateExpDate);
		vehicleInfo.setLicPlateState(licPlateState);
		vehicleInfo.setMakeDescription(makeDescription);
		vehicleInfo.setMilage(mileage);
		vehicleInfo.setModelDescription(modelDescription);
		vehicleInfo.setModelYear(modelYear);
		vehicleInfo.setVin(vin);
		vehicleInfo.setClaim(claim);
		vehiclesInfo.addAll(vehiclesInfo);
		// }
		// claim.setVehicles(vehiclesInfo);

		claimDao.createClaim(claim);
	}
}
