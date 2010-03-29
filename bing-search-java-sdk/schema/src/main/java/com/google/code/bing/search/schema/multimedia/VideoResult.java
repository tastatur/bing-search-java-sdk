
package com.google.code.bing.search.schema.multimedia;

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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}Title" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}PlayUrl" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}SourceTitle" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}RunTime" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}ClickThroughPageUrl" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}StaticThumbnail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface VideoResult
    extends SchemaEntity
{


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
     * Gets the value of the playUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPlayUrl();

    /**
     * Sets the value of the playUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPlayUrl(String value);

    /**
     * Gets the value of the sourceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSourceTitle();

    /**
     * Sets the value of the sourceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSourceTitle(String value);

    /**
     * Gets the value of the runTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getRunTime();

    /**
     * Sets the value of the runTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setRunTime(Long value);

    /**
     * Gets the value of the clickThroughPageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getClickThroughPageUrl();

    /**
     * Sets the value of the clickThroughPageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setClickThroughPageUrl(String value);

    /**
     * Gets the value of the staticThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link StaticThumbnail }
     *     
     */
    StaticThumbnail getStaticThumbnail();

    /**
     * Sets the value of the staticThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticThumbnail }
     *     
     */
    void setStaticThumbnail(StaticThumbnail value);

}
