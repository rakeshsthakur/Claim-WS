package com.mitchell.claim.business.utils;

import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.junit.Test;

import com.mitchell.claim.business.dao.AbstractTestClass;

public class DomainUtilsTest extends AbstractTestClass {

	@Test
	public void testToXMLGerogian() {
			assertNotNull(DomainUtils.toXmlGregotian(new Date()));		

	}

	@Test
	public void testToDate() throws DatatypeConfigurationException{
		assertNotNull(DomainUtils.toDate(DatatypeFactory.newInstance().newXMLGregorianCalendar()));
	}
}
