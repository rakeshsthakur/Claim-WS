package com.mitchell.claim.business.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GetClaimListByLossDateRangeTest extends AbstractTestClass {

	@Autowired
	private IClaimDao claimDao;

	@Test
	public void testReadClaimByLossDateRange() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");
		assertNotNull(claimDao.readClaimByLossDateRange(sdf.parse("1/1/2012"), new Date()));
	}
}
