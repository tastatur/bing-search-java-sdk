
package com.microsoft.schemas.livesearch._2008._03.search;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfImageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfImageResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImageResult" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ImageResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImageResult", propOrder = {
    "imageResult"
})
public class ArrayOfImageResult {

    @XmlElement(name = "ImageResult")
    protected List<ImageResult> imageResult;

    /**
     * Gets the value of the imageResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageResult }
     * 
     * 
     */
    public List<ImageResult> getImageResult() {
        if (imageResult == null) {
            imageResult = new ArrayList<ImageResult>();
        }
        return this.imageResult;
    }

}
