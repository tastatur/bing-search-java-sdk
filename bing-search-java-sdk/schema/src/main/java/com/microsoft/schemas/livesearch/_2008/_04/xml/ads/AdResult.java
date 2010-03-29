
package com.microsoft.schemas.livesearch._2008._04.xml.ads;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Rank"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Position"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Title"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Description"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}DisplayUrl"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}AdLinkUrl"/>
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
    "rank",
    "position",
    "title",
    "description",
    "displayUrl",
    "adLinkUrl"
})
@XmlRootElement(name = "AdResult")
public class AdResult
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Rank", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long rank;
    @XmlElement(name = "Position", required = true)
    protected String position;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "DisplayUrl", required = true)
    protected String displayUrl;
    @XmlElement(name = "AdLinkUrl", required = true)
    protected String adLinkUrl;

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(Long value) {
        this.rank = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

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
     * Gets the value of the adLinkUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdLinkUrl() {
        return adLinkUrl;
    }

    /**
     * Sets the value of the adLinkUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdLinkUrl(String value) {
        this.adLinkUrl = value;
    }

}
