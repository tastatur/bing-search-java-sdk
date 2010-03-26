
package com.microsoft.schemas.livesearch._2008._04.xml.news;

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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/news}Name" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/news}NewsArticles" minOccurs="0"/>
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
    "name",
    "newsArticles"
})
@XmlRootElement(name = "NewsCollection")
public class NewsCollection {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NewsArticles")
    protected NewsArticles newsArticles;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the newsArticles property.
     * 
     * @return
     *     possible object is
     *     {@link NewsArticles }
     *     
     */
    public NewsArticles getNewsArticles() {
        return newsArticles;
    }

    /**
     * Sets the value of the newsArticles property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsArticles }
     *     
     */
    public void setNewsArticles(NewsArticles value) {
        this.newsArticles = value;
    }

}
