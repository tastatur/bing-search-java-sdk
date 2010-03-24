
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="RelatedSearches" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ArrayOfNewsRelatedSearch" minOccurs="0"/>
 *         &lt;element name="Results" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ArrayOfNewsResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsResponse", propOrder = {
    "total",
    "offset",
    "relatedSearches",
    "results"
})
public class NewsResponse {

    @XmlElement(name = "Total")
    @XmlSchemaType(name = "unsignedInt")
    protected Long total;
    @XmlElement(name = "Offset")
    @XmlSchemaType(name = "unsignedInt")
    protected Long offset;
    @XmlElement(name = "RelatedSearches")
    protected ArrayOfNewsRelatedSearch relatedSearches;
    @XmlElement(name = "Results")
    protected ArrayOfNewsResult results;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotal(Long value) {
        this.total = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOffset(Long value) {
        this.offset = value;
    }

    /**
     * Gets the value of the relatedSearches property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNewsRelatedSearch }
     *     
     */
    public ArrayOfNewsRelatedSearch getRelatedSearches() {
        return relatedSearches;
    }

    /**
     * Sets the value of the relatedSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewsRelatedSearch }
     *     
     */
    public void setRelatedSearches(ArrayOfNewsRelatedSearch value) {
        this.relatedSearches = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNewsResult }
     *     
     */
    public ArrayOfNewsResult getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewsResult }
     *     
     */
    public void setResults(ArrayOfNewsResult value) {
        this.results = value;
    }

}
