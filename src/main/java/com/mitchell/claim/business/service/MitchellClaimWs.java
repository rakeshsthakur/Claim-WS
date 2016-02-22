package com.mitchell.claim.business.service;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitchell.claim.business.IMitchellClaim;
import com.mitchell.claim.business.process.CreateClaimBP;
import com.mitchell.claim.business.process.GetClaimsListByLossDateRangeBP;
import com.mitchell.claim.business.process.IGenericBusinessProcess;
import com.mitchell.claim.business.process.ReadClaimByClaimIdBP;
import com.mitchell.claim.business.process.UpdateClaimDetailsBP;
import com.mitchell.claim.business.wsdl.CreateClaimResponse;
import com.mitchell.claim.business.wsdl.GetClaimByClaimIdRequest;
import com.mitchell.claim.business.wsdl.GetClaimByClaimIdResponse;
import com.mitchell.claim.business.wsdl.GetClaimsListByLossDateRanageRequest;
import com.mitchell.claim.business.wsdl.GetClaimsListByLossDateRangeResponse;
import com.mitchell.claim.business.wsdl.MitchellClaimType;
import com.mitchell.claim.business.wsdl.MitchellClaimUpdateType;
import com.mitchell.claim.business.wsdl.UpDateClaimResponse;

@Service("claimJaxWs")
@WebService(serviceName = "Claim", targetNamespace = "http://www.mitchell.com/examples/claim", endpointInterface = "com.mitchell.claim.business.wsdl.ClaimService")
public class MitchellClaimWs implements IMitchellClaim {

	@Autowired
	private CreateClaimBP createClaimBP;

	@Autowired
	private ReadClaimByClaimIdBP readClaimByClaimIdBP;
	
	@Autowired
	private UpdateClaimDetailsBP updateClaimDetailsBP;
	
	@Autowired
	private GetClaimsListByLossDateRangeBP getClaimsListByLossDateRangeBP;

	@Override
	public CreateClaimResponse createClaim(MitchellClaimType payload) {
		return execute(createClaimBP, payload);
	}

	@Override
	public GetClaimByClaimIdResponse getClaimByClaimId(GetClaimByClaimIdRequest payload) {
		return execute(readClaimByClaimIdBP, payload);
	}

	@Override
	public GetClaimsListByLossDateRangeResponse getClaimsListByLossDateRange(
			GetClaimsListByLossDateRanageRequest payload) {
		return execute(getClaimsListByLossDateRangeBP, payload);
	}
	
	@Override
	public UpDateClaimResponse upDateClaim(MitchellClaimUpdateType payload) {
		return execute(updateClaimDetailsBP, payload);
	}


	// Generic method which returns the results from respective business process
	private <I, O> O execute(IGenericBusinessProcess<I, O> bp, I payload) {
		try {
			return bp.execute(payload);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}