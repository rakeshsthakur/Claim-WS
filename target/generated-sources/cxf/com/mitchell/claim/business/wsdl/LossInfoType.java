
package com.mitchell.claim.business.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LossInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LossInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CauseOfLoss" type="{http://www.mitchell.com/examples/claim}CauseOfLossCode" minOccurs="0"/&gt;
 *         &lt;element name="ReportedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LossDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LossInfoType", propOrder = {
    "causeOfLoss",
    "reportedDate",
    "lossDescription"
})
public class LossInfoType {

    @XmlElement(name = "CauseOfLoss")
    @XmlSchemaType(name = "string")
    protected CauseOfLossCode causeOfLoss;
    @XmlElement(name = "ReportedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportedDate;
    @XmlElement(name = "LossDescription")
    protected String lossDescription;

    /**
     * Gets the value of the causeOfLoss property.
     * 
     * @return
     *     possible object is
     *     {@link CauseOfLossCode }
     *     
     */
    public CauseOfLossCode getCauseOfLoss() {
        return causeOfLoss;
    }

    /**
     * Sets the value of the causeOfLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link CauseOfLossCode }
     *     
     */
    public void setCauseOfLoss(CauseOfLossCode value) {
        this.causeOfLoss = value;
    }

    /**
     * Gets the value of the reportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportedDate() {
        return reportedDate;
    }

    /**
     * Sets the value of the reportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportedDate(XMLGregorianCalendar value) {
        this.reportedDate = value;
    }

    /**
     * Gets the value of the lossDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossDescription() {
        return lossDescription;
    }

    /**
     * Sets the value of the lossDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossDescription(String value) {
        this.lossDescription = value;
    }

}
