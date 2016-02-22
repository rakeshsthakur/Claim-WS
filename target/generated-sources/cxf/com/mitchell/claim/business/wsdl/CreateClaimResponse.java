
package com.mitchell.claim.business.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaimCreatedResponse" type="{http://www.mitchell.com/examples/claim}MitchellClaimType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "claimCreatedResponse"
})
@XmlRootElement(name = "CreateClaimResponse")
public class CreateClaimResponse {

    @XmlElement(name = "ClaimCreatedResponse", required = true)
    protected MitchellClaimType claimCreatedResponse;

    /**
     * Gets the value of the claimCreatedResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MitchellClaimType }
     *     
     */
    public MitchellClaimType getClaimCreatedResponse() {
        return claimCreatedResponse;
    }

    /**
     * Sets the value of the claimCreatedResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MitchellClaimType }
     *     
     */
    public void setClaimCreatedResponse(MitchellClaimType value) {
        this.claimCreatedResponse = value;
    }

}
