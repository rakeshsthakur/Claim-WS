package com.mitchell.claim.business.process;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mitchell.claim.business.dao.IClaimDao;
import com.mitchell.claim.business.utils.DomainUtils;
import com.mitchell.claim.business.wsdl.GetClaimByClaimIdRequest;
import com.mitchell.claim.business.wsdl.GetClaimByClaimIdResponse;
import com.mitchell.claim.business.wsdl.MitchellClaimType;
import com.mitchell.claim.model.Claim;

@Component
public class ReadClaimByClaimIdBP extends Exception
		implements IGenericBusinessProcess<GetClaimByClaimIdRequest, GetClaimByClaimIdResponse> {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IClaimDao claimDao;

	@Override
	public GetClaimByClaimIdResponse execute(GetClaimByClaimIdRequest input) throws Exception {
		if (input.getClaimId().isEmpty()){
			throw new Exception("ClaimNumber cannot be  empty");
		}
		String claimId = input.getClaimId();
		List<Claim> claimList = claimDao.readClaimById(claimId);

		return respond(claimList);
	}

	private GetClaimByClaimIdResponse respond(List<Claim> claimList) {
		MitchellClaimType mitchellClaimType = null;
		GetClaimByClaimIdResponse getClaimResponse = new GetClaimByClaimIdResponse();
		for (Claim claim : claimList) {
			mitchellClaimType = DomainUtils.toXMLClaim(claim);
		}
		getClaimResponse.setClaimResponse(mitchellClaimType);
		return getClaimResponse;
	}

}
