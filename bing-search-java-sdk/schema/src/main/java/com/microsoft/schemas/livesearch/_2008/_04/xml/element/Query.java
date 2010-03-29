
package com.microsoft.schemas.livesearch._2008._04.xml.element;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchTerms",
    "alteredQuery",
    "alterationOverrideQuery"
})
@XmlRootElement(name = "Query")
public class Query
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
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
