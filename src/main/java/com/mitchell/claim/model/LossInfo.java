package com.mitchell.claim.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loss_info", schema = "mitchell_claim")
public class LossInfo {
	public LossInfo() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "loss_id", nullable = false)
	private Integer loss_id;

	@Column(name = "cause_of_loss")
	private String causeOfLoss;

	@Column(name = "reported_date")
	private Date reportedDate;

	@Column(name = "loss_description")
	private String lossDescription;

	public String getCauseOfLoss() {
		return causeOfLoss;
	}

	public Integer getLoss_id() {
		return loss_id;
	}

	public String getLossDescription() {
		return lossDescription;
	}

	public Date getReportedDate() {
		return reportedDate;
	}

	public void setCauseOfLoss(String causeOfLoss) {
		this.causeOfLoss = causeOfLoss;
	}

	public void setLoss_id(Integer loss_id) {
		this.loss_id = loss_id;
	}

	public void setLossDescription(String lossDescription) {
		this.lossDescription = lossDescription;
	}

	public void setReportedDate(Date reportedDate) {
		this.reportedDate = reportedDate;
	}

}
