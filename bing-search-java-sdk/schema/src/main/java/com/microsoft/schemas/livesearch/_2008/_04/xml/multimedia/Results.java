
package com.microsoft.schemas.livesearch._2008._04.xml.multimedia;

import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}ImageResult" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}VideoResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "imageResult",
    "videoResult"
})
@XmlRootElement(name = "Results")
public class Results {

    @XmlElement(name = "ImageResult")
    protected List<ImageResult> imageResult;
    @XmlElement(name = "VideoResult")
    protected List<VideoResult> videoResult;

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

    /**
     * Gets the value of the videoResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoResult }
     * 
     * 
     */
    public List<VideoResult> getVideoResult() {
        if (videoResult == null) {
            videoResult = new ArrayList<VideoResult>();
        }
        return this.videoResult;
    }

}
