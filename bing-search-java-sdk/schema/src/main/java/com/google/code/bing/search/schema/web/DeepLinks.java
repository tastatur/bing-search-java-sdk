
package com.google.code.bing.search.schema.web;

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
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/web}DeepLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface DeepLinks
    extends SchemaEntity
{


    /**
     * Gets the value of the deepLinkList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deepLinkList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeepLinkList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeepLink }
     * 
     * 
     */
    List<DeepLink> getDeepLinkList();

}
