
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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer}Results" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface InstantAnswer
    extends SchemaEntity
{


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
