package com.mitchell.claim.business.process;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mitchell.claim.business.dao.IClaimDao;
import com.mitchell.claim.business.utils.DomainUtils;
import com.mitchell.claim.business.wsdl.GetClaimsListByLossDateRanageRequest;
import com.mitchell.claim.business.wsdl.GetClaimsListByLossDateRangeResponse;
import com.mitchell.claim.model.Claim;

@Component
public class GetClaimsListByLossDateRangeBP extends Exception
		implements IGenericBusinessProcess<GetClaimsListByLossDateRanageRequest, GetClaimsListByLossDateRangeResponse> {

	private static final long serialVersionUID = 1L;

	@Autowired
	private IClaimDao claimDao;

	@Override
	public GetClaimsListByLossDateRangeResponse execute(GetClaimsListByLossDateRanageRequest input) throws Exception {

		if ((input.getEndDate() == null || input.getStartDate() == null)) {
			throw new Exception("Start and End Dates cannot be null");

		}
		if(input.getEndDate().toGregorianCalendar()
				.getTimeInMillis() < input.getStartDate().toGregorianCalendar().getTimeInMillis()){
			throw new Exception("Start date cannot be greater then end date");
		}
		Date startDateTime = input.getStartDate().toGregorianCalendar().getTime();
		Date EndDateTime = input.getEndDate().toGregorianCalendar().getTime();
		List<Claim> b = claimDao.readClaimByLossDateRange(startDateTime, EndDateTime);
		return respond(b);
	}
/**
 * sets the result list from db to service's response
 * @param List<Claim>
 * @return
 */
	private GetClaimsListByLossDateRangeResponse respond(List<Claim> b) {
		GetClaimsListByLossDateRangeResponse claimsList = new GetClaimsListByLossDateRangeResponse();
		for (Claim claim : b) {
			claimsList.getMitchellClaim().add(DomainUtils.toXMLClaim(claim));
		}
		return claimsList;
	}

}
