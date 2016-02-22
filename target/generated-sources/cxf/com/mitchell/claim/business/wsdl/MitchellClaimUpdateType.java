
package com.mitchell.claim.business.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MitchellClaimUpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MitchellClaimUpdateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AssignedAdjusterID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="VehiclesUpdate" type="{http://www.mitchell.com/examples/claim}VehicleListUpdateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MitchellClaimUpdateType", propOrder = {
    "claimNumber",
    "assignedAdjusterID",
    "vehiclesUpdate"
})
public class MitchellClaimUpdateType {

    @XmlElement(name = "ClaimNumber", required = true)
    protected String claimNumber;
    @XmlElement(name = "AssignedAdjusterID")
    protected Long assignedAdjusterID;
    @XmlElement(name = "VehiclesUpdate")
    protected VehicleListUpdateType vehiclesUpdate;

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
     * Gets the value of the vehiclesUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleListUpdateType }
     *     
     */
    public VehicleListUpdateType getVehiclesUpdate() {
        return vehiclesUpdate;
    }

    /**
     * Sets the value of the vehiclesUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleListUpdateType }
     *     
     */
    public void setVehiclesUpdate(VehicleListUpdateType value) {
        this.vehiclesUpdate = value;
    }

}
