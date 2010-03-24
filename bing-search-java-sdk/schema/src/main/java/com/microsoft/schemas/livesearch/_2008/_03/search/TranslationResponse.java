
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranslationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranslationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ArrayOfTranslationResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslationResponse", propOrder = {
    "results"
})
public class TranslationResponse {

    @XmlElement(name = "Results")
    protected ArrayOfTranslationResult results;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTranslationResult }
     *     
     */
    public ArrayOfTranslationResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTranslationResult }
     *     
     */
    public void setResults(ArrayOfTranslationResult value) {
        this.results = value;
    }

}
