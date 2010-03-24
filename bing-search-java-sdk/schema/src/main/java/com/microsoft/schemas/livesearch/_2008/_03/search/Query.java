
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Query complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Query">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlteredQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlterationOverrideQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Query", propOrder = {
    "searchTerms",
    "alteredQuery",
    "alterationOverrideQuery"
})
public class Query {

    @XmlElement(name = "SearchTerms")
    protected String searchTerms;
    @XmlElement(name = "AlteredQuery")
    protected String alteredQuery;
    @XmlElement(name = "AlterationOverrideQuery")
    protected String alterationOverrideQuery;

    /**
     * Gets the value of the searchTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTerms() {
        return searchTerms;
    }

    /**
     * Sets the value of the searchTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTerms(String value) {
        this.searchTerms = value;
    }

    /**
     * Gets the value of the alteredQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlteredQuery() {
        return alteredQuery;
    }

    /**
     * Sets the value of the alteredQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlteredQuery(String value) {
        this.alteredQuery = value;
    }

    /**
     * Gets the value of the alterationOverrideQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlterationOverrideQuery() {
        return alterationOverrideQuery;
    }

    /**
     * Sets the value of the alterationOverrideQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlterationOverrideQuery(String value) {
        this.alterationOverrideQuery = value;
    }

}
