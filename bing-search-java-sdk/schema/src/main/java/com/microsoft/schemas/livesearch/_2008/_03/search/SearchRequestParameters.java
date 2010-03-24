
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Market" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UILanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Adult" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}AdultOption" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Radius" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Options" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ArrayOfSearchOption" minOccurs="0"/>
 *         &lt;element name="Sources" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ArrayOfSourceType"/>
 *         &lt;element name="Web" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}WebRequest" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ImageRequest" minOccurs="0"/>
 *         &lt;element name="Phonebook" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}PhonebookRequest" minOccurs="0"/>
 *         &lt;element name="Video" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}VideoRequest" minOccurs="0"/>
 *         &lt;element name="News" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}NewsRequest" minOccurs="0"/>
 *         &lt;element name="MobileWeb" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}MobileWebRequest" minOccurs="0"/>
 *         &lt;element name="Translation" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}TranslationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequest", propOrder = {
    "version",
    "market",
    "uiLanguage",
    "query",
    "appId",
    "adult",
    "latitude",
    "longitude",
    "radius",
    "options",
    "sources",
    "web",
    "image",
    "phonebook",
    "video",
    "news",
    "mobileWeb",
    "translation"
})
public class SearchRequestParameters {

    @XmlElement(name = "Version", defaultValue = "2.2")
    protected String version;
    @XmlElement(name = "Market")
    protected String market;
    @XmlElement(name = "UILanguage")
    protected String uiLanguage;
    @XmlElement(name = "Query", required = true)
    protected String query;
    @XmlElement(name = "AppId", required = true)
    protected String appId;
    @XmlElement(name = "Adult")
    protected AdultOption adult;
    @XmlElement(name = "Latitude")
    protected Double latitude;
    @XmlElement(name = "Longitude")
    protected Double longitude;
    @XmlElement(name = "Radius")
    protected Double radius;
    @XmlElement(name = "Options")
    protected ArrayOfSearchOption options;
    @XmlElement(name = "Sources", required = true)
    protected ArrayOfSourceType sources;
    @XmlElement(name = "Web")
    protected WebRequest web;
    @XmlElement(name = "Image")
    protected ImageRequest image;
    @XmlElement(name = "Phonebook")
    protected PhonebookRequest phonebook;
    @XmlElement(name = "Video")
    protected VideoRequest video;
    @XmlElement(name = "News")
    protected NewsRequest news;
    @XmlElement(name = "MobileWeb")
    protected MobileWebRequest mobileWeb;
    @XmlElement(name = "Translation")
    protected TranslationRequest translation;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket(String value) {
        this.market = value;
    }

    /**
     * Gets the value of the uiLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUILanguage() {
        return uiLanguage;
    }

    /**
     * Sets the value of the uiLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUILanguage(String value) {
        this.uiLanguage = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the adult property.
     * 
     * @return
     *     possible object is
     *     {@link AdultOption }
     *     
     */
    public AdultOption getAdult() {
        return adult;
    }

    /**
     * Sets the value of the adult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdultOption }
     *     
     */
    public void setAdult(AdultOption value) {
        this.adult = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadius(Double value) {
        this.radius = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchOption }
     *     
     */
    public ArrayOfSearchOption getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchOption }
     *     
     */
    public void setOptions(ArrayOfSearchOption value) {
        this.options = value;
    }

    /**
     * Gets the value of the sources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public ArrayOfSourceType getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSourceType }
     *     
     */
    public void setSources(ArrayOfSourceType value) {
        this.sources = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link WebRequest }
     *     
     */
    public WebRequest getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRequest }
     *     
     */
    public void setWeb(WebRequest value) {
        this.web = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link ImageRequest }
     *     
     */
    public ImageRequest getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageRequest }
     *     
     */
    public void setImage(ImageRequest value) {
        this.image = value;
    }

    /**
     * Gets the value of the phonebook property.
     * 
     * @return
     *     possible object is
     *     {@link PhonebookRequest }
     *     
     */
    public PhonebookRequest getPhonebook() {
        return phonebook;
    }

    /**
     * Sets the value of the phonebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhonebookRequest }
     *     
     */
    public void setPhonebook(PhonebookRequest value) {
        this.phonebook = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link VideoRequest }
     *     
     */
    public VideoRequest getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoRequest }
     *     
     */
    public void setVideo(VideoRequest value) {
        this.video = value;
    }

    /**
     * Gets the value of the news property.
     * 
     * @return
     *     possible object is
     *     {@link NewsRequest }
     *     
     */
    public NewsRequest getNews() {
        return news;
    }

    /**
     * Sets the value of the news property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsRequest }
     *     
     */
    public void setNews(NewsRequest value) {
        this.news = value;
    }

    /**
     * Gets the value of the mobileWeb property.
     * 
     * @return
     *     possible object is
     *     {@link MobileWebRequest }
     *     
     */
    public MobileWebRequest getMobileWeb() {
        return mobileWeb;
    }

    /**
     * Sets the value of the mobileWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileWebRequest }
     *     
     */
    public void setMobileWeb(MobileWebRequest value) {
        this.mobileWeb = value;
    }

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link TranslationRequest }
     *     
     */
    public TranslationRequest getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslationRequest }
     *     
     */
    public void setTranslation(TranslationRequest value) {
        this.translation = value;
    }

}
