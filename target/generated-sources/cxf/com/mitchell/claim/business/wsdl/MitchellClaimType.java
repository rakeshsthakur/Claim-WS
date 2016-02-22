
package com.mitchell.claim.business.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MitchellClaimType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MitchellClaimType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClaimantFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaimantLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.mitchell.com/examples/claim}StatusCode" minOccurs="0"/&gt;
 *         &lt;element name="LossDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LossInfo" type="{http://www.mitchell.com/examples/claim}LossInfoType" minOccurs="0"/&gt;
 *         &lt;element name="AssignedAdjusterID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Vehicles" type="{http://www.mitchell.com/examples/claim}VehicleListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MitchellClaimType", propOrder = {
    "claimNumber",
    "claimantFirstName",
    "claimantLastName",
    "status",
    "lossDate",
    "lossInfo",
    "assignedAdjusterID",
    "vehicles"
})
public class MitchellClaimType {

    @XmlElement(name = "ClaimNumber", required = true)
    protected String claimNumber;
    @XmlElement(name = "ClaimantFirstName")
    protected String claimantFirstName;
    @XmlElement(name = "ClaimantLastName")
    protected String claimantLastName;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected StatusCode status;
    @XmlElement(name = "LossDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lossDate;
    @XmlElement(name = "LossInfo")
    protected LossInfoType lossInfo;
    @XmlElement(name = "AssignedAdjusterID")
    protected Long assignedAdjusterID;
    @XmlElement(name = "Vehicles")
    protected VehicleListType vehicles;

    /**
     * Gets the value of the claimNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimNumber(String value) {
        this.claimNumber = value;
    }

    /**
     * Gets the value of the claimantFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimantFirstName() {
        return claimantFirstName;
    }

    /**
     * Sets the value of the claimantFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimantFirstName(String value) {
        this.claimantFirstName = value;
    }

    /**
     * Gets the value of the claimantLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimantLastName() {
        return claimantLastName;
    }

    /**
     * Sets the value of the claimantLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimantLastName(String value) {
        this.claimantLastName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCode }
     *     
     */
    public StatusCode getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCode }
     *     
     */
    public void setStatus(StatusCode value) {
        this.status = value;
    }

    /**
     * Gets the value of the lossDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLossDate() {
        return lossDate;
    }

    /**
     * Sets the value of the lossDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLossDate(XMLGregorianCalendar value) {
        this.lossDate = value;
    }

    /**
     * Gets the value of the lossInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LossInfoType }
     *     
     */
    public LossInfoType getLossInfo() {
        return lossInfo;
    }

    /**
     * Sets the value of the lossInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossInfoType }
     *     
     */
    public void setLossInfo(LossInfoType value) {
        this.lossInfo = value;
    }

    /**
     * Gets the value of the assignedAdjusterID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssignedAdjusterID() {
        return assignedAdjusterID;
    }

    /**
     * Sets the value of the assignedAdjusterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssignedAdjusterID(Long value) {
        this.assignedAdjusterID = value;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleListType }
     *     
     */
    public VehicleListType getVehicles() {
        return vehicles;
    }

    /**
     * Sets the value of the vehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleListType }
     *     
     */
    public void setVehicles(VehicleListType value) {
        this.vehicles = value;
    }

}
