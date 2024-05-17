//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.03 at 08:29:45 AM AEST 
//

package au.csiro.fhir.transforms.xml.dmd.v2_3.bnf;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for BnfVmpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BnfVmpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="VPID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BNF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ATC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDD" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="DDD_UOMCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BnfVmpType", propOrder = {

})
public class BnfVmpType {

    @XmlElement(name = "VPID", required = true)
    protected BigInteger vpid;
    @XmlElement(name = "BNF")
    protected String bnf;
    @XmlElement(name = "ATC")
    protected String atc;
    @XmlElement(name = "DDD")
    protected Float ddd;
    @XmlElement(name = "DDD_UOMCD")
    protected String ddd_uomcd;     

    /**
     * Gets the value of the vpid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVPID() {
        return vpid;
    }

    /**
     * Sets the value of the vpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVPID(BigInteger value) {
        this.vpid = value;
    }


    /**
     * Gets the value of the bnf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNF() {
        return bnf;
    }

    /**
     * Sets the value of the bnf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNF(String value) {
        this.bnf = value;
    }

    /**
     * Gets the value of the atc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATC() {
        return atc;
    }

    /**
     * Sets the value of the atc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATC(String value) {
        this.atc = value;
    }
    
    /**
     * Gets the value of the ddd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Float getDDD() {
        return ddd;
    }

    /**
     * Sets the value of the ddd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDDD(Float value) {
        this.ddd = value;
    }

    /**
     * Gets the value of the ddd_uomcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDD_UOMCD() {
        return ddd_uomcd;
    }

    /**
     * Sets the value of the ddd_uomcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDD_UOMCD(String value) {
        this.ddd_uomcd = value;
    }    
}
