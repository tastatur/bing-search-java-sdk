
package com.microsoft.schemas.livesearch._2008._04.xml.ads;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;
import org.w3._2001.xmlschema.Adapter2;


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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Total"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}PageNumber"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}AdApiVersion"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Results"/>
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
    "total",
    "pageNumber",
    "adApiVersion",
    "results"
})
@XmlRootElement(name = "Ad")
public class Ad
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Total", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long total;
    @XmlElement(name = "PageNumber", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long pageNumber;
    @XmlElement(name = "AdApiVersion", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double adApiVersion;
    @XmlElement(name = "Results", required = true)
    protected Results results;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public void setTotal(Long value) {
        this.total = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(Long value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the adApiVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAdApiVersion() {
        return adApiVersion;
    }

    /**
     * Sets the value of the adApiVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdApiVersion(Double value) {
        this.adApiVersion = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link Results }
     *     
     */
    public Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link Results }
     *     
     */
    public void setResults(Results value) {
        this.results = value;
    }

}
