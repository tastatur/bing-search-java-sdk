
package com.google.code.bing.search.schema.instantanswer;

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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer}ContentType" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer}Title" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer}ClickThroughUrl" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer}Url" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer}Attribution" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer}InstantAnswerSpecificData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface InstantAnswerResult
    extends SchemaEntity
{


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
     * Gets the value of the clickThroughUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getClickThroughUrl();

    /**
     * Sets the value of the clickThroughUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setClickThroughUrl(String value);

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
     * Gets the value of the attribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAttribution();

    /**
     * Sets the value of the attribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAttribution(String value);

    /**
     * Gets the value of the instantAnswerSpecificData property.
     * 
     * @return
     *     possible object is
     *     {@link InstantAnswerSpecificData }
     *     
     */
    InstantAnswerSpecificData getInstantAnswerSpecificData();

    /**
     * Sets the value of the instantAnswerSpecificData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantAnswerSpecificData }
     *     
     */
    void setInstantAnswerSpecificData(InstantAnswerSpecificData value);

}
