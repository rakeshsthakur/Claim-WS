package com.mitchell.claim.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "claim", schema = "mitchell_claim")
public class Claim {

	@Id
	@Column(name = "claim_number", nullable = false)
	private String claimNumber;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "status")
	private String status;

	@Column(name = "loss_date")
	private Date lossDate;

	// one to one association with lossinfo
	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "loss_id")
	private LossInfo lossInfo;

	@Column(name = "assigned_adjusted_id")
	private Long AssignedAdjusterID;

	// one to one association with vehicles
	@OneToMany(mappedBy = "claim", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	// @JoinColumn(name = "vehicle_id")
	private List<Vehicles> vehicles;

	public Claim() {
	}

	public Long getAssignedAdjusterID() {
		return AssignedAdjusterID;
	}

	public String getClaimNumber() {
		return claimNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getLossDate() {
		return lossDate;
	}

	public LossInfo getLossInfo() {
		return lossInfo;
	}

	public String getStatus() {
		return status;
	}

	public List<Vehicles> getVehicles() {
		return vehicles;
	}

	public void setAssignedAdjusterID(Long assignedAdjusterID) {
		AssignedAdjusterID = assignedAdjusterID;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLossDate(Date date) {
		this.lossDate = date;
	}

	public void setLossInfo(LossInfo lossInfo) {
		this.lossInfo = lossInfo;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setVehicles(List<Vehicles> vehicles) {
		this.vehicles = vehicles;
	}


}
