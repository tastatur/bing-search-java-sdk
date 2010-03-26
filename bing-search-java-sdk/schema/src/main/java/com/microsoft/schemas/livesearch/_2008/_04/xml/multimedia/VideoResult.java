
package com.microsoft.schemas.livesearch._2008._04.xml.multimedia;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}Title" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}PlayUrl" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}SourceTitle" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}RunTime" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}ClickThroughPageUrl" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}StaticThumbnail" minOccurs="0"/>
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
    "playUrl",
    "sourceTitle",
    "runTime",
    "clickThroughPageUrl",
    "staticThumbnail"
})
@XmlRootElement(name = "VideoResult")
public class VideoResult {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "PlayUrl")
    protected String playUrl;
    @XmlElement(name = "SourceTitle")
    protected String sourceTitle;
    @XmlElement(name = "RunTime")
    protected BigInteger runTime;
    @XmlElement(name = "ClickThroughPageUrl")
    protected String clickThroughPageUrl;
    @XmlElement(name = "StaticThumbnail")
    protected StaticThumbnail staticThumbnail;

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
     * Gets the value of the playUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayUrl() {
        return playUrl;
    }

    /**
     * Sets the value of the playUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayUrl(String value) {
        this.playUrl = value;
    }

    /**
     * Gets the value of the sourceTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceTitle() {
        return sourceTitle;
    }

    /**
     * Sets the value of the sourceTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceTitle(String value) {
        this.sourceTitle = value;
    }

    /**
     * Gets the value of the runTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRunTime() {
        return runTime;
    }

    /**
     * Sets the value of the runTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRunTime(BigInteger value) {
        this.runTime = value;
    }

    /**
     * Gets the value of the clickThroughPageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClickThroughPageUrl() {
        return clickThroughPageUrl;
    }

    /**
     * Sets the value of the clickThroughPageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClickThroughPageUrl(String value) {
        this.clickThroughPageUrl = value;
    }

    /**
     * Gets the value of the staticThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link StaticThumbnail }
     *     
     */
    public StaticThumbnail getStaticThumbnail() {
        return staticThumbnail;
    }

    /**
     * Sets the value of the staticThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaticThumbnail }
     *     
     */
    public void setStaticThumbnail(StaticThumbnail value) {
        this.staticThumbnail = value;
    }

}
