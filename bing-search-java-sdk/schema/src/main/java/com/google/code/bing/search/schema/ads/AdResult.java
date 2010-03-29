
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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Rank"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Position"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Title"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Description"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}DisplayUrl"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}AdLinkUrl"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface AdResult
    extends SchemaEntity
{


    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getRank();

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setRank(Long value);

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPosition();

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPosition(String value);

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTitle(String value);

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDescription();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDescription(String value);

    /**
     * Gets the value of the displayUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDisplayUrl();

    /**
     * Sets the value of the displayUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDisplayUrl(String value);

    /**
     * Gets the value of the adLinkUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAdLinkUrl();

    /**
     * Sets the value of the adLinkUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAdLinkUrl(String value);

}
