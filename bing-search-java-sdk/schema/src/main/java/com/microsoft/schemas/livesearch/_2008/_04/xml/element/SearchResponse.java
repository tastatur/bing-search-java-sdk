
package com.microsoft.schemas.livesearch._2008._04.xml.element;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.microsoft.schemas.livesearch._2008._04.xml.ads.Ad;
import com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswer;
import com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.MobileWeb;
import com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Image;
import com.microsoft.schemas.livesearch._2008._04.xml.multimedia.Video;
import com.microsoft.schemas.livesearch._2008._04.xml.news.News;
import com.microsoft.schemas.livesearch._2008._04.xml.phonebook.Phonebook;
import com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.RelatedSearch;
import com.microsoft.schemas.livesearch._2008._04.xml.spell.Spell;
import com.microsoft.schemas.livesearch._2008._04.xml.translation.Translation;
import com.microsoft.schemas.livesearch._2008._04.xml.web.Web;
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
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element}Query"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads}Ad" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer}InstantAnswer" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/mobileweb}MobileWeb" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}Image" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia}Video" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook}Phonebook" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/relatedsearch}RelatedSearch" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/spell}Spell" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/news}News" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/translation}Translation" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/web}Web" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "query",
    "ad",
    "instantAnswer",
    "mobileWeb",
    "image",
    "video",
    "phonebook",
    "relatedSearch",
    "spell",
    "news",
    "translation",
    "web"
})
@XmlRootElement(name = "SearchResponse")
public class SearchResponse
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Query", required = true)
    protected Query query;
    @XmlElement(name = "Ad", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/ads")
    protected Ad ad;
    @XmlElement(name = "InstantAnswer", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/instantanswer")
    protected InstantAnswer instantAnswer;
    @XmlElement(name = "MobileWeb", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/mobileweb")
    protected MobileWeb mobileWeb;
    @XmlElement(name = "Image", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia")
    protected Image image;
    @XmlElement(name = "Video", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/multimedia")
    protected Video video;
    @XmlElement(name = "Phonebook", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/phonebook")
    protected Phonebook phonebook;
    @XmlElement(name = "RelatedSearch", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/relatedsearch")
    protected RelatedSearch relatedSearch;
    @XmlElement(name = "Spell", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/spell")
    protected Spell spell;
    @XmlElement(name = "News", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/news")
    protected News news;
    @XmlElement(name = "Translation", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/translation")
    protected Translation translation;
    @XmlElement(name = "Web", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/web")
    protected Web web;
    @XmlAttribute(name = "Version", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double version;

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
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link Ad }
     *     
     */
    public Ad getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ad }
     *     
     */
    public void setAd(Ad value) {
        this.ad = value;
    }

    /**
     * Gets the value of the instantAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link InstantAnswer }
     *     
     */
    public InstantAnswer getInstantAnswer() {
        return instantAnswer;
    }

    /**
     * Sets the value of the instantAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantAnswer }
     *     
     */
    public void setInstantAnswer(InstantAnswer value) {
        this.instantAnswer = value;
    }

    /**
     * Gets the value of the mobileWeb property.
     * 
     * @return
     *     possible object is
     *     {@link MobileWeb }
     *     
     */
    public MobileWeb getMobileWeb() {
        return mobileWeb;
    }

    /**
     * Sets the value of the mobileWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileWeb }
     *     
     */
    public void setMobileWeb(MobileWeb value) {
        this.mobileWeb = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link Video }
     *     
     */
    public Video getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link Video }
     *     
     */
    public void setVideo(Video value) {
        this.video = value;
    }

    /**
     * Gets the value of the phonebook property.
     * 
     * @return
     *     possible object is
     *     {@link Phonebook }
     *     
     */
    public Phonebook getPhonebook() {
        return phonebook;
    }

    /**
     * Sets the value of the phonebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phonebook }
     *     
     */
    public void setPhonebook(Phonebook value) {
        this.phonebook = value;
    }

    /**
     * Gets the value of the relatedSearch property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSearch }
     *     
     */
    public RelatedSearch getRelatedSearch() {
        return relatedSearch;
    }

    /**
     * Sets the value of the relatedSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSearch }
     *     
     */
    public void setRelatedSearch(RelatedSearch value) {
        this.relatedSearch = value;
    }

    /**
     * Gets the value of the spell property.
     * 
     * @return
     *     possible object is
     *     {@link Spell }
     *     
     */
    public Spell getSpell() {
        return spell;
    }

    /**
     * Sets the value of the spell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spell }
     *     
     */
    public void setSpell(Spell value) {
        this.spell = value;
    }

    /**
     * Gets the value of the news property.
     * 
     * @return
     *     possible object is
     *     {@link News }
     *     
     */
    public News getNews() {
        return news;
    }

    /**
     * Sets the value of the news property.
     * 
     * @param value
     *     allowed object is
     *     {@link News }
     *     
     */
    public void setNews(News value) {
        this.news = value;
    }

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link Translation }
     *     
     */
    public Translation getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Translation }
     *     
     */
    public void setTranslation(Translation value) {
        this.translation = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link Web }
     *     
     */
    public Web getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link Web }
     *     
     */
    public void setWeb(Web value) {
        this.web = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getVersion() {
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
    public void setVersion(Double value) {
        this.version = value;
    }

}
