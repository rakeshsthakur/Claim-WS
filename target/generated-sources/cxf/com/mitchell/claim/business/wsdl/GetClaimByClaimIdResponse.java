
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
 *         &lt;element name="ClaimResponse" type="{http://www.mitchell.com/examples/claim}MitchellClaimType"/&gt;
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
    "claimResponse"
})
@XmlRootElement(name = "GetClaimByClaimIdResponse")
public class GetClaimByClaimIdResponse {

    @XmlElement(name = "ClaimResponse", required = true)
    protected MitchellClaimType claimResponse;

    /**
     * Gets the value of the claimResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MitchellClaimType }
     *     
     */
    public MitchellClaimType getClaimResponse() {
        return claimResponse;
    }

    /**
     * Sets the value of the claimResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MitchellClaimType }
     *     
     */
    public void setClaimResponse(MitchellClaimType value) {
        this.claimResponse = value;
    }

}
