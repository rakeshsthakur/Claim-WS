package com.mitchell.claim.business.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitchell.claim.business.dao.IClaimDao;
import com.mitchell.claim.business.wsdl.MitchellClaimUpdateType;
import com.mitchell.claim.model.Claim;

@Repository
public class ClaimDaoImpl implements IClaimDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public Claim createClaim(Claim input) {
		try {
			entityManager.persist(input);
		} catch (Exception e) {
			System.out.println(e);
		}

		return input;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Claim> readClaimById(String input) {
		List<Claim> claimList = null;

		try {
			Query q = entityManager.createQuery("Select c from Claim c where claim_number=:claim_number")
					.setParameter("claim_number", input);
			claimList = q.getResultList();
		} catch (Exception e) {
			System.out.println(e);
		}

		return claimList;

	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Claim> readClaimByLossDateRange(Date startDateTime, Date endDateTime) {
		List<Claim> claimList = null;
		try {

			Query q = entityManager
					.createQuery("SELECT c FROM Claim c " + "WHERE loss_date>=:startDateTime "
							+ "AND loss_date<=:endDateTime")
					.setParameter("startDateTime", startDateTime).setParameter("endDateTime", endDateTime);

			claimList = q.getResultList();
		} catch (Exception e) {
			System.out.println(e);

		}
		return claimList;
	}

	@Override
	@Transactional
	public Boolean updateClaim(MitchellClaimUpdateType claim) {
		Query q = entityManager
				.createNativeQuery("UPDATE claim as c, vehicles_info as v"
						+ " SET c.assigned_adjusted_id=:assigned_adjusted_id," + "v.exterior_color=:exterior_color,"
						+ "v.vin=:vin,v.lic_plate_exp_date=:lic_plate_exp_date"
						+ " WHERE c.claim_number=v.claim_claim_number" + " AND c.claim_number=:claim_number")
				.setParameter("assigned_adjusted_id", claim.getAssignedAdjusterID())
				.setParameter("exterior_color",
						claim.getVehiclesUpdate().getVehicleUpdateDetails().get(0).getExteriorColor())
				.setParameter("vin", claim.getVehiclesUpdate().getVehicleUpdateDetails().get(0).getExteriorColor())
				.setParameter("lic_plate_exp_date",
						claim.getVehiclesUpdate().getVehicleUpdateDetails().get(0).getLicPlateExpDate().toGregorianCalendar().getTime())
				.setParameter("claim_number", claim.getClaimNumber());

		Boolean IsClaimUpdated = q.executeUpdate() > 0 ? true : false;
		return IsClaimUpdated;
	}
}
