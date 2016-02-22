package com.mitchell.claim.business.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mitchell.claim.business.dao.impl.ClaimDaoImpl;
import com.mitchell.claim.model.Claim;
import com.mitchell.claim.model.Vehicles;

public class ReadClaimlByClaimIdTest extends AbstractTestClass {

	@Autowired
	private ClaimDaoImpl claimDao;

	@Test
	public void testCURD() {
		List<Claim> a = claimDao.readClaimById("test4");
		assertNotNull(a);
		for (Claim b : a) {
			System.out.println(b.getLossInfo().getCauseOfLoss());
			for (Vehicles vehicleInfo : b.getVehicles()) {
				assertNotNull(vehicleInfo.getDamageDescription());
			}
		}
	}
}