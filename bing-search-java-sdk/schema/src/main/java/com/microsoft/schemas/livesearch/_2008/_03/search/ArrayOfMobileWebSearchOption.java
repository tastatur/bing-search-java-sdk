
package com.microsoft.schemas.livesearch._2008._03.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMobileWebSearchOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMobileWebSearchOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobileWebSearchOption" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}MobileWebSearchOption" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMobileWebSearchOption", propOrder = {
    "mobileWebSearchOption"
})
public class ArrayOfMobileWebSearchOption {

    @XmlElement(name = "MobileWebSearchOption")
    protected List<MobileWebSearchOption> mobileWebSearchOption;

    /**
     * Gets the value of the mobileWebSearchOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileWebSearchOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileWebSearchOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileWebSearchOption }
     * 
     * 
     */
    public List<MobileWebSearchOption> getMobileWebSearchOption() {
        if (mobileWebSearchOption == null) {
            mobileWebSearchOption = new ArrayList<MobileWebSearchOption>();
        }
        return this.mobileWebSearchOption;
    }

}
