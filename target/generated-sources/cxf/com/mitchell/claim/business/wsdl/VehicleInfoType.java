
package com.mitchell.claim.business.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VehicleInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MakeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EngineDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExteriorColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicPlateState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicPlateExpDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DamageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mileage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleInfoType", propOrder = {
    "modelYear",
    "makeDescription",
    "modelDescription",
    "engineDescription",
    "exteriorColor",
    "vin",
    "licPlate",
    "licPlateState",
    "licPlateExpDate",
    "damageDescription",
    "mileage"
})
public class VehicleInfoType {

    @XmlElement(name = "ModelYear")
    protected int modelYear;
    @XmlElement(name = "MakeDescription")
    protected String makeDescription;
    @XmlElement(name = "ModelDescription")
    protected String modelDescription;
    @XmlElement(name = "EngineDescription")
    protected String engineDescription;
    @XmlElement(name = "ExteriorColor")
    protected String exteriorColor;
    @XmlElement(name = "Vin")
    protected String vin;
    @XmlElement(name = "LicPlate")
    protected String licPlate;
    @XmlElement(name = "LicPlateState")
    protected String licPlateState;
    @XmlElement(name = "LicPlateExpDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licPlateExpDate;
    @XmlElement(name = "DamageDescription")
    protected String damageDescription;
    @XmlElement(name = "Mileage")
    protected Integer mileage;

    /**
     * Gets the value of the modelYear property.
     * 
     */
    public int getModelYear() {
        return modelYear;
    }

    /**
     * Sets the value of the modelYear property.
     * 
     */
    public void setModelYear(int value) {
        this.modelYear = value;
    }

    /**
     * Gets the value of the makeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeDescription() {
        return makeDescription;
    }

    /**
     * Sets the value of the makeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeDescription(String value) {
        this.makeDescription = value;
    }

    /**
     * Gets the value of the modelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelDescription() {
        return modelDescription;
    }

    /**
     * Sets the value of the modelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelDescription(String value) {
        this.modelDescription = value;
    }

    /**
     * Gets the value of the engineDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineDescription() {
        return engineDescription;
    }

    /**
     * Sets the value of the engineDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineDescription(String value) {
        this.engineDescription = value;
    }

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
     * Gets the value of the licPlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicPlate() {
        return licPlate;
    }

    /**
     * Sets the value of the licPlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicPlate(String value) {
        this.licPlate = value;
    }

    /**
     * Gets the value of the licPlateState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicPlateState() {
        return licPlateState;
    }

    /**
     * Sets the value of the licPlateState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicPlateState(String value) {
        this.licPlateState = value;
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

    /**
     * Gets the value of the damageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamageDescription() {
        return damageDescription;
    }

    /**
     * Sets the value of the damageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamageDescription(String value) {
        this.damageDescription = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMileage(Integer value) {
        this.mileage = value;
    }

}
