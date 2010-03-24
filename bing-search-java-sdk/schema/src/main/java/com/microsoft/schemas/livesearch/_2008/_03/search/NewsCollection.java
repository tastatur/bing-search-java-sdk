
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewsCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewsCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewsArticles" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ArrayOfNewsArticle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewsCollection", propOrder = {
    "name",
    "newsArticles"
})
public class NewsCollection {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NewsArticles")
    protected ArrayOfNewsArticle newsArticles;

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
     *     {@link ArrayOfNewsArticle }
     *     
     */
    public ArrayOfNewsArticle getNewsArticles() {
        return newsArticles;
    }

    /**
     * Sets the value of the newsArticles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNewsArticle }
     *     
     */
    public void setNewsArticles(ArrayOfNewsArticle value) {
        this.newsArticles = value;
    }

}
