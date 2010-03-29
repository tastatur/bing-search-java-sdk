
package com.google.code.bing.search.schema;



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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element}SearchTerms" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element}AlteredQuery" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element}AlterationOverrideQuery" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Query
    extends SchemaEntity
{


    /**
     * Gets the value of the searchTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSearchTerms();

    /**
     * Sets the value of the searchTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSearchTerms(String value);

    /**
     * Gets the value of the alteredQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAlteredQuery();

    /**
     * Sets the value of the alteredQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAlteredQuery(String value);

    /**
     * Gets the value of the alterationOverrideQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAlterationOverrideQuery();

    /**
     * Sets the value of the alterationOverrideQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAlterationOverrideQuery(String value);

}
