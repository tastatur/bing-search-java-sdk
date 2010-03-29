
package com.google.code.bing.search.schema;

import com.google.code.bing.search.schema.ads.Ad;
import com.google.code.bing.search.schema.instantanswer.InstantAnswer;
import com.google.code.bing.search.schema.mobileweb.MobileWeb;
import com.google.code.bing.search.schema.multimedia.Image;
import com.google.code.bing.search.schema.multimedia.Video;
import com.google.code.bing.search.schema.news.News;
import com.google.code.bing.search.schema.phonebook.Phonebook;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearch;
import com.google.code.bing.search.schema.spell.Spell;
import com.google.code.bing.search.schema.translation.Translation;
import com.google.code.bing.search.schema.web.Web;


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
public interface SearchResponse
    extends SchemaEntity
{


    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Query }
     *     
     */
    Query getQuery();

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Query }
     *     
     */
    void setQuery(Query value);

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link Ad }
     *     
     */
    Ad getAd();

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ad }
     *     
     */
    void setAd(Ad value);

    /**
     * Gets the value of the instantAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link InstantAnswer }
     *     
     */
    InstantAnswer getInstantAnswer();

    /**
     * Sets the value of the instantAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantAnswer }
     *     
     */
    void setInstantAnswer(InstantAnswer value);

    /**
     * Gets the value of the mobileWeb property.
     * 
     * @return
     *     possible object is
     *     {@link MobileWeb }
     *     
     */
    MobileWeb getMobileWeb();

    /**
     * Sets the value of the mobileWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileWeb }
     *     
     */
    void setMobileWeb(MobileWeb value);

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    Image getImage();

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    void setImage(Image value);

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link Video }
     *     
     */
    Video getVideo();

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link Video }
     *     
     */
    void setVideo(Video value);

    /**
     * Gets the value of the phonebook property.
     * 
     * @return
     *     possible object is
     *     {@link Phonebook }
     *     
     */
    Phonebook getPhonebook();

    /**
     * Sets the value of the phonebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phonebook }
     *     
     */
    void setPhonebook(Phonebook value);

    /**
     * Gets the value of the relatedSearch property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSearch }
     *     
     */
    RelatedSearch getRelatedSearch();

    /**
     * Sets the value of the relatedSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSearch }
     *     
     */
    void setRelatedSearch(RelatedSearch value);

    /**
     * Gets the value of the spell property.
     * 
     * @return
     *     possible object is
     *     {@link Spell }
     *     
     */
    Spell getSpell();

    /**
     * Sets the value of the spell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spell }
     *     
     */
    void setSpell(Spell value);

    /**
     * Gets the value of the news property.
     * 
     * @return
     *     possible object is
     *     {@link News }
     *     
     */
    News getNews();

    /**
     * Sets the value of the news property.
     * 
     * @param value
     *     allowed object is
     *     {@link News }
     *     
     */
    void setNews(News value);

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link Translation }
     *     
     */
    Translation getTranslation();

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Translation }
     *     
     */
    void setTranslation(Translation value);

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link Web }
     *     
     */
    Web getWeb();

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link Web }
     *     
     */
    void setWeb(Web value);

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Double getVersion();

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setVersion(Double value);

}
