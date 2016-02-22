package com.mitchell.claim.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicles_info", schema = "mitchell_claim")
public class Vehicles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vehcile_id")
	private Integer vehicle_id;
	@Column(name = "model_year")
	private Integer modelYear;

	@Column(name = "make_description")
	private String makeDescription;

	@Column(name = "model_description")
	private String modelDescription;

	@Column(name = "engine_description")
	private String engineDescription;

	@Column(name = "exterior_color")
	private String exteriorColor;

	@Column(name = "vin")
	private String vin;

	@ManyToOne
	private Claim claim;
	@Column(name = "lic_plate")
	private String licPlate;

	@Column(name = "lic_plate_state")
	private String licPlateState;

	@Column(name = "lic_plate_exp_date")
	private Date licPlateExpDate;

	@Column(name = "damage_description")
	private String damageDescription;

	@Column(name = "mileage")
	private Integer mileage;

	public Vehicles() {

	}

	public Claim getClaim() {
		return claim;
	}

	public String getDamageDescription() {
		return damageDescription;
	}

	public String getEngineDescription() {
		return engineDescription;
	}

	public String getExteriorColor() {
		return exteriorColor;
	}

	public String getLicPlate() {
		return licPlate;
	}

	public Date getLicPlateExpDate() {
		return licPlateExpDate;
	}

	public String getLicPlateState() {
		return licPlateState;
	}

	public String getMakeDescription() {
		return makeDescription;
	}

	public Integer getMilage() {
		return mileage;
	}

	public Integer getMileage() {
		return mileage;
	}

	public String getModelDescription() {
		return modelDescription;
	}

	public Integer getModelYear() {
		return modelYear;
	}

	public Integer getVehicle_id() {
		return vehicle_id;
	}

	public String getVin() {
		return vin;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

	public void setDamageDescription(String damageDescription) {
		this.damageDescription = damageDescription;
	}

	public void setEngineDescription(String engineDescription) {
		this.engineDescription = engineDescription;
	}

	public void setExteriorColor(String exteriorColor) {
		this.exteriorColor = exteriorColor;
	}

	public void setLicPlate(String licPlate) {
		this.licPlate = licPlate;
	}


	public void setLicPlateExpDate(Date licPlateExpDate) {
		this.licPlateExpDate = licPlateExpDate;
	}

	public void setLicPlateState(String licPlateState) {
		this.licPlateState = licPlateState;
	}

	public void setMakeDescription(String makeDescription) {
		this.makeDescription = makeDescription;
	}

	public void setMilage(Integer milage) {
		this.mileage = milage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}

	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}

	public void setVehicle_id(Integer vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

}
