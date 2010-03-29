
package com.google.code.bing.search.schema.translation;

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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/translation}TranslatedTerm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface TranslationResult
    extends SchemaEntity
{


    /**
     * Gets the value of the translatedTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTranslatedTerm();

    /**
     * Sets the value of the translatedTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTranslatedTerm(String value);

}
