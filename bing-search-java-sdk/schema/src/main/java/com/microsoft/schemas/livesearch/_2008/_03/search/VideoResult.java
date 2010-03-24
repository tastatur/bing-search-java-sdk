
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PlayUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RunTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ClickThroughPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StaticThumbnail" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}Thumbnail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoResult", propOrder = {
    "title",
    "playUrl",
    "sourceTitle",
    "runTime",
    "clickThroughPageUrl",
    "staticThumbnail"
})
public class VideoResult {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "PlayUrl")
    protected String playUrl;
    @XmlElement(name = "SourceTitle")
    protected String sourceTitle;
    @XmlElement(name = "RunTime")
    @XmlSchemaType(name = "unsignedInt")
    protected Long runTime;
    @XmlElement(name = "ClickThroughPageUrl")
    protected String clickThroughPageUrl;
    @XmlElement(name = "StaticThumbnail")
    protected Thumbnail staticThumbnail;

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
     *     {@link Long }
     *     
     */
    public Long getRunTime() {
        return runTime;
    }

    /**
     * Sets the value of the runTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRunTime(Long value) {
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
     *     {@link Thumbnail }
     *     
     */
    public Thumbnail getStaticThumbnail() {
        return staticThumbnail;
    }

    /**
     * Sets the value of the staticThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Thumbnail }
     *     
     */
    public void setStaticThumbnail(Thumbnail value) {
        this.staticThumbnail = value;
    }

}
