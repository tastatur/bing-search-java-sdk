
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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}MediaUrl" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}Url" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}DisplayUrl" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}Width" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}Height" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}FileSize" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}ContentType" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}Thumbnail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface ImageResult
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
     * Gets the value of the mediaUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getMediaUrl();

    /**
     * Sets the value of the mediaUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setMediaUrl(String value);

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getUrl();

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUrl(String value);

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
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getWidth();

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setWidth(Long value);

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getHeight();

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setHeight(Long value);

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getFileSize();

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFileSize(Long value);

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getContentType();

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setContentType(String value);

    /**
     * Gets the value of the thumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link Thumbnail }
     *     
     */
    Thumbnail getThumbnail();

    /**
     * Sets the value of the thumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thumbnail }
     *     
     */
    void setThumbnail(Thumbnail value);

}
