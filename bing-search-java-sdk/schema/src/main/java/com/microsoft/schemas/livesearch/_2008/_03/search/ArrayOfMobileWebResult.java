
package com.microsoft.schemas.livesearch._2008._03.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMobileWebResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMobileWebResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobileWebResult" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}MobileWebResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMobileWebResult", propOrder = {
    "mobileWebResult"
})
public class ArrayOfMobileWebResult {

    @XmlElement(name = "MobileWebResult")
    protected List<MobileWebResult> mobileWebResult;

    /**
     * Gets the value of the mobileWebResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileWebResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileWebResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileWebResult }
     * 
     * 
     */
    public List<MobileWebResult> getMobileWebResult() {
        if (mobileWebResult == null) {
            mobileWebResult = new ArrayList<MobileWebResult>();
        }
        return this.mobileWebResult;
    }

}
