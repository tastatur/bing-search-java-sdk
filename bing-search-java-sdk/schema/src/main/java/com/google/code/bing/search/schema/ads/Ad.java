
package com.google.code.bing.search.schema.ads;

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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Total"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}PageNumber"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}AdApiVersion"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Results"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Ad
    extends SchemaEntity
{


    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getTotal();

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTotal(Long value);

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getPageNumber();

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPageNumber(Long value);

    /**
     * Gets the value of the adApiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Double getAdApiVersion();

    /**
     * Sets the value of the adApiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAdApiVersion(Double value);

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link Results }
     *     
     */
    Results getResults();

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link Results }
     *     
     */
    void setResults(Results value);

}
