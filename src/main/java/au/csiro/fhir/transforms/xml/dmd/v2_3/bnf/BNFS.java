//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.03 at 08:29:45 AM AEST 
//


package au.csiro.fhir.transforms.xml.dmd.v2_3.bnf;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vmps",
    "amps"
})
@XmlRootElement(name = "BNF_DETAILS")
public class BNFS {

    @XmlElement(name = "VMPS", required = true)
    protected BNFS.VMPS vmps;
    @XmlElement(name = "AMPS", required = true)
    protected BNFS.AMPS amps;    

    /**
     * Gets the value of the vmps property.
     * 
     * @return
     *     possible object is
     *     {@link BNFS.VMPS }
     *     
     */
    public BNFS.VMPS getVMPS() {
        return vmps;
    }

    /**
     * Gets the value of the vmps property.
     * 
     * @return
     *     possible object is
     *     {@link BNFS.AMPS }
     *     
     */
    public BNFS.AMPS getAMPS() {
        return amps;
    }    

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
     *         &lt;element name="VMP" type="{}BnfVmpType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "vmp"
    })
    public static class VMPS {

        @XmlElement(name = "VMP")
        protected List<BnfVmpType> vmp;

        /**
         * Gets the value of the vmp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vmp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVMP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BnfVmpType }
         * 
         * 
         */
        public List<BnfVmpType> getVMP() {
            if (vmp == null) {
                vmp = new ArrayList<BnfVmpType>();
            }
            return this.vmp;
        }
    }

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
     *         &lt;element name="AMP" type="{}BnfAmpType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "amp"
    })
    public static class AMPS {

        @XmlElement(name = "AMP")
        protected List<BnfAmpType> amp;

        /**
         * Gets the value of the amp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAMP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BnfAmpType }
         * 
         * 
         */
        public List<BnfAmpType> getAMP() {
            if (amp == null) {
                amp = new ArrayList<BnfAmpType>();
            }
            return this.amp;
        }
    }

}
