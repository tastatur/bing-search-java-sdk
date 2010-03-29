
package com.google.code.bing.search.schema.multimedia;

import java.util.List;
import com.google.code.bing.search.schema.SchemaEntity;


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
public interface Results
    extends SchemaEntity
{


    /**
     * Gets the value of the imageResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageResult }
     * 
     * 
     */
    List<ImageResult> getImageResultList();

    /**
     * Gets the value of the videoResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoResult }
     * 
     * 
     */
    List<VideoResult> getVideoResultList();

}
