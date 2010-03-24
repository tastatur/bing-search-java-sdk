
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CacheUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchTags" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ArrayOfWebSearchTag" minOccurs="0"/>
 *         &lt;element name="DeepLinks" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ArrayOfDeepLink" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebResult", propOrder = {
    "title",
    "description",
    "url",
    "cacheUrl",
    "displayUrl",
    "dateTime",
    "searchTags",
    "deepLinks"
})
public class WebResult {

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
    protected ArrayOfWebSearchTag searchTags;
    @XmlElement(name = "DeepLinks")
    protected ArrayOfDeepLink deepLinks;

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
     *     {@link ArrayOfWebSearchTag }
     *     
     */
    public ArrayOfWebSearchTag getSearchTags() {
        return searchTags;
    }

    /**
     * Sets the value of the searchTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWebSearchTag }
     *     
     */
    public void setSearchTags(ArrayOfWebSearchTag value) {
        this.searchTags = value;
    }

    /**
     * Gets the value of the deepLinks property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeepLink }
     *     
     */
    public ArrayOfDeepLink getDeepLinks() {
        return deepLinks;
    }

    /**
     * Sets the value of the deepLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeepLink }
     *     
     */
    public void setDeepLinks(ArrayOfDeepLink value) {
        this.deepLinks = value;
    }

}
