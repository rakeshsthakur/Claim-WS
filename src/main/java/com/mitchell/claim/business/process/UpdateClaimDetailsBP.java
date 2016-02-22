package com.mitchell.claim.business.process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mitchell.claim.business.dao.IClaimDao;
import com.mitchell.claim.business.wsdl.MitchellClaimUpdateType;
import com.mitchell.claim.business.wsdl.UpDateClaimResponse;

@Component
public class UpdateClaimDetailsBP extends Exception
		implements IGenericBusinessProcess<MitchellClaimUpdateType, UpDateClaimResponse> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private IClaimDao claimDao;

	@Override
	public UpDateClaimResponse execute(MitchellClaimUpdateType input) throws Exception {
		if (input.getClaimNumber().isEmpty()) {
			throw new Exception("claim number cannot be empty");
		}

		Boolean IsClaimUpdated = claimDao.updateClaim(input);
		return respond(IsClaimUpdated);
	}

	private UpDateClaimResponse respond(Boolean IsClaimUpdated) {
		UpDateClaimResponse upDateClaimResponse = new UpDateClaimResponse();
		upDateClaimResponse.setIsClaimUpdated(IsClaimUpdated);
		return upDateClaimResponse;
	}

}
