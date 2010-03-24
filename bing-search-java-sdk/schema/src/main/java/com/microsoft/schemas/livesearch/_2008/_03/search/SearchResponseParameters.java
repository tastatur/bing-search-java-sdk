
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Query" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}Query" minOccurs="0"/>
 *         &lt;element name="Spell" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}SpellResponse" minOccurs="0"/>
 *         &lt;element name="Web" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}WebResponse" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ImageResponse" minOccurs="0"/>
 *         &lt;element name="RelatedSearch" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}RelatedSearchResponse" minOccurs="0"/>
 *         &lt;element name="Phonebook" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}PhonebookResponse" minOccurs="0"/>
 *         &lt;element name="Video" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}VideoResponse" minOccurs="0"/>
 *         &lt;element name="InstantAnswer" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}InstantAnswerResponse" minOccurs="0"/>
 *         &lt;element name="News" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}NewsResponse" minOccurs="0"/>
 *         &lt;element name="MobileWeb" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}MobileWebResponse" minOccurs="0"/>
 *         &lt;element name="Translation" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}TranslationResponse" minOccurs="0"/>
 *         &lt;element name="Errors" type="{http://schemas.microsoft.com/LiveSearch/2008/03/Search}ArrayOfError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResponse", propOrder = {
    "version",
    "query",
    "spell",
    "web",
    "image",
    "relatedSearch",
    "phonebook",
    "video",
    "instantAnswer",
    "news",
    "mobileWeb",
    "translation",
    "errors"
})
public class SearchResponseParameters {

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "Query")
    protected Query query;
    @XmlElement(name = "Spell")
    protected SpellResponse spell;
    @XmlElement(name = "Web")
    protected WebResponse web;
    @XmlElement(name = "Image")
    protected ImageResponse image;
    @XmlElement(name = "RelatedSearch")
    protected RelatedSearchResponse relatedSearch;
    @XmlElement(name = "Phonebook")
    protected PhonebookResponse phonebook;
    @XmlElement(name = "Video")
    protected VideoResponse video;
    @XmlElement(name = "InstantAnswer")
    protected InstantAnswerResponse instantAnswer;
    @XmlElement(name = "News")
    protected NewsResponse news;
    @XmlElement(name = "MobileWeb")
    protected MobileWebResponse mobileWeb;
    @XmlElement(name = "Translation")
    protected TranslationResponse translation;
    @XmlElement(name = "Errors")
    protected ArrayOfError errors;

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
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Query }
     *     
     */
    public Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Query }
     *     
     */
    public void setQuery(Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the spell property.
     * 
     * @return
     *     possible object is
     *     {@link SpellResponse }
     *     
     */
    public SpellResponse getSpell() {
        return spell;
    }

    /**
     * Sets the value of the spell property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpellResponse }
     *     
     */
    public void setSpell(SpellResponse value) {
        this.spell = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link WebResponse }
     *     
     */
    public WebResponse getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebResponse }
     *     
     */
    public void setWeb(WebResponse value) {
        this.web = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link ImageResponse }
     *     
     */
    public ImageResponse getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageResponse }
     *     
     */
    public void setImage(ImageResponse value) {
        this.image = value;
    }

    /**
     * Gets the value of the relatedSearch property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSearchResponse }
     *     
     */
    public RelatedSearchResponse getRelatedSearch() {
        return relatedSearch;
    }

    /**
     * Sets the value of the relatedSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSearchResponse }
     *     
     */
    public void setRelatedSearch(RelatedSearchResponse value) {
        this.relatedSearch = value;
    }

    /**
     * Gets the value of the phonebook property.
     * 
     * @return
     *     possible object is
     *     {@link PhonebookResponse }
     *     
     */
    public PhonebookResponse getPhonebook() {
        return phonebook;
    }

    /**
     * Sets the value of the phonebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhonebookResponse }
     *     
     */
    public void setPhonebook(PhonebookResponse value) {
        this.phonebook = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link VideoResponse }
     *     
     */
    public VideoResponse getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoResponse }
     *     
     */
    public void setVideo(VideoResponse value) {
        this.video = value;
    }

    /**
     * Gets the value of the instantAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link InstantAnswerResponse }
     *     
     */
    public InstantAnswerResponse getInstantAnswer() {
        return instantAnswer;
    }

    /**
     * Sets the value of the instantAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantAnswerResponse }
     *     
     */
    public void setInstantAnswer(InstantAnswerResponse value) {
        this.instantAnswer = value;
    }

    /**
     * Gets the value of the news property.
     * 
     * @return
     *     possible object is
     *     {@link NewsResponse }
     *     
     */
    public NewsResponse getNews() {
        return news;
    }

    /**
     * Sets the value of the news property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsResponse }
     *     
     */
    public void setNews(NewsResponse value) {
        this.news = value;
    }

    /**
     * Gets the value of the mobileWeb property.
     * 
     * @return
     *     possible object is
     *     {@link MobileWebResponse }
     *     
     */
    public MobileWebResponse getMobileWeb() {
        return mobileWeb;
    }

    /**
     * Sets the value of the mobileWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileWebResponse }
     *     
     */
    public void setMobileWeb(MobileWebResponse value) {
        this.mobileWeb = value;
    }

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link TranslationResponse }
     *     
     */
    public TranslationResponse getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslationResponse }
     *     
     */
    public void setTranslation(TranslationResponse value) {
        this.translation = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfError }
     *     
     */
    public ArrayOfError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfError }
     *     
     */
    public void setErrors(ArrayOfError value) {
        this.errors = value;
    }

}
