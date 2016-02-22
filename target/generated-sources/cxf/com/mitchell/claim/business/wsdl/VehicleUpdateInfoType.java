
package com.mitchell.claim.business.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VehicleUpdateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleUpdateInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExteriorColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicPlateExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleUpdateInfoType", propOrder = {
    "exteriorColor",
    "vin",
    "licPlateExpDate"
})
public class VehicleUpdateInfoType {

    @XmlElement(name = "ExteriorColor")
    protected String exteriorColor;
    @XmlElement(name = "Vin")
    protected String vin;
    @XmlElement(name = "LicPlateExpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licPlateExpDate;

    /**
     * Gets the value of the exteriorColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExteriorColor() {
        return exteriorColor;
    }

    /**
     * Sets the value of the exteriorColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExteriorColor(String value) {
        this.exteriorColor = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the licPlateExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicPlateExpDate() {
        return licPlateExpDate;
    }

    /**
     * Sets the value of the licPlateExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLicPlateExpDate(XMLGregorianCalendar value) {
        this.licPlateExpDate = value;
    }

}
