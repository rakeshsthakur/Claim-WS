package com.mitchell.claim.business.dao;

import java.util.Date;
import java.util.List;

import com.mitchell.claim.business.wsdl.MitchellClaimUpdateType;
import com.mitchell.claim.model.Claim;

public interface IClaimDao {

	/**
	 * Creates a new claim entry to the database
	 * 
	 * @param input
	 * @return Claim
	 */
	Claim createClaim(Claim input);

	/**
	 * Gets claim that matches the given claimNumber as input
	 * 
	 * @param input
	 * @return Claim
	 */
	List<Claim> readClaimById(String input);

	/**
	 * gets list of claims from database that fall in the given date-time range
	 * 
	 * @param startDateTime
	 * @param endDateTime
	 * 
	 * @return a list with claims
	 */
	List<Claim> readClaimByLossDateRange(Date startDateTime, Date endDateTime);

	/**
	 * Takes entities to update as per update-claim.xml and returns true if
	 * query is successful
	 * 
	 * @param MitchellClaimUpdateType
	 * @return boolean
	 */
	Boolean updateClaim(MitchellClaimUpdateType input);

}
