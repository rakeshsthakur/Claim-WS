
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
 *         &lt;element name="IsClaimUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isClaimUpdated"
})
@XmlRootElement(name = "UpDateClaimResponse")
public class UpDateClaimResponse {

    @XmlElement(name = "IsClaimUpdated")
    protected boolean isClaimUpdated;

    /**
     * Gets the value of the isClaimUpdated property.
     * 
     */
    public boolean isIsClaimUpdated() {
        return isClaimUpdated;
    }

    /**
     * Sets the value of the isClaimUpdated property.
     * 
     */
    public void setIsClaimUpdated(boolean value) {
        this.isClaimUpdated = value;
    }

}
