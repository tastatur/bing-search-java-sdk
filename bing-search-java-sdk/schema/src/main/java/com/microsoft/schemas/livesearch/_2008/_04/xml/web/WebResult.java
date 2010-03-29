
package com.microsoft.schemas.livesearch._2008._04.xml.web;

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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/web}Title" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/web}Description" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/web}Url" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/web}CacheUrl" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/web}DisplayUrl" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/web}DateTime" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/web}SearchTags" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/web}DeepLinks" minOccurs="0"/>
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
    "title",
    "description",
    "url",
    "cacheUrl",
    "displayUrl",
    "dateTime",
    "searchTags",
    "deepLinks"
})
@XmlRootElement(name = "WebResult")
public class WebResult
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "CacheUrl")
    protected String cacheUrl;
    @XmlElement(name = "DisplayUrl")
    protected String displayUrl;
    @XmlElement(name = "DateTime")
    protected String dateTime;
    @XmlElement(name = "SearchTags")
    protected SearchTags searchTags;
    @XmlElement(name = "DeepLinks")
    protected DeepLinks deepLinks;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the cacheUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheUrl() {
        return cacheUrl;
    }

    /**
     * Sets the value of the cacheUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheUrl(String value) {
        this.cacheUrl = value;
    }

    /**
     * Gets the value of the displayUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * Sets the value of the displayUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayUrl(String value) {
        this.displayUrl = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the searchTags property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTags }
     *     
     */
    public SearchTags getSearchTags() {
        return searchTags;
    }

    /**
     * Sets the value of the searchTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTags }
     *     
     */
    public void setSearchTags(SearchTags value) {
        this.searchTags = value;
    }

    /**
     * Gets the value of the deepLinks property.
     * 
     * @return
     *     possible object is
     *     {@link DeepLinks }
     *     
     */
    public DeepLinks getDeepLinks() {
        return deepLinks;
    }

    /**
     * Sets the value of the deepLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeepLinks }
     *     
     */
    public void setDeepLinks(DeepLinks value) {
        this.deepLinks = value;
    }

}
