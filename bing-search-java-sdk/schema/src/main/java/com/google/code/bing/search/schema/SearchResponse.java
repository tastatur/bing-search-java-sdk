
package com.google.code.bing.search.schema;

import com.google.code.bing.search.schema.ads.AdResponse;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResponse;
import com.google.code.bing.search.schema.mobileweb.MobileWebResponse;
import com.google.code.bing.search.schema.multimedia.ImageResponse;
import com.google.code.bing.search.schema.multimedia.VideoResponse;
import com.google.code.bing.search.schema.news.NewsResponse;
import com.google.code.bing.search.schema.phonebook.PhonebookResponse;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResponse;
import com.google.code.bing.search.schema.spell.SpellResponse;
import com.google.code.bing.search.schema.translation.TranslationResponse;
import com.google.code.bing.search.schema.web.WebResponse;


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
     *     {@link AdResponse }
     *     
     */
    AdResponse getAd();

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdResponse }
     *     
     */
    void setAd(AdResponse value);

    /**
     * Gets the value of the instantAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link InstantAnswerResponse }
     *     
     */
    InstantAnswerResponse getInstantAnswer();

    /**
     * Sets the value of the instantAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstantAnswerResponse }
     *     
     */
    void setInstantAnswer(InstantAnswerResponse value);

    /**
     * Gets the value of the mobileWeb property.
     * 
     * @return
     *     possible object is
     *     {@link MobileWebResponse }
     *     
     */
    MobileWebResponse getMobileWeb();

    /**
     * Sets the value of the mobileWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileWebResponse }
     *     
     */
    void setMobileWeb(MobileWebResponse value);

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link ImageResponse }
     *     
     */
    ImageResponse getImage();

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageResponse }
     *     
     */
    void setImage(ImageResponse value);

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link VideoResponse }
     *     
     */
    VideoResponse getVideo();

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoResponse }
     *     
     */
    void setVideo(VideoResponse value);

    /**
     * Gets the value of the phonebook property.
     * 
     * @return
     *     possible object is
     *     {@link PhonebookResponse }
     *     
     */
    PhonebookResponse getPhonebook();

    /**
     * Sets the value of the phonebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhonebookResponse }
     *     
     */
    void setPhonebook(PhonebookResponse value);

    /**
     * Gets the value of the relatedSearch property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedSearchResponse }
     *     
     */
    RelatedSearchResponse getRelatedSearch();

    /**
     * Sets the value of the relatedSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedSearchResponse }
     *     
     */
    void setRelatedSearch(RelatedSearchResponse value);

    /**
     * Gets the value of the spell property.
     * 
     * @return
     *     possible object is
     *     {@link SpellResponse }
     *     
     */
    SpellResponse getSpell();

    /**
     * Sets the value of the spell property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpellResponse }
     *     
     */
    void setSpell(SpellResponse value);

    /**
     * Gets the value of the news property.
     * 
     * @return
     *     possible object is
     *     {@link NewsResponse }
     *     
     */
    NewsResponse getNews();

    /**
     * Sets the value of the news property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsResponse }
     *     
     */
    void setNews(NewsResponse value);

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link TranslationResponse }
     *     
     */
    TranslationResponse getTranslation();

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslationResponse }
     *     
     */
    void setTranslation(TranslationResponse value);

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link WebResponse }
     *     
     */
    WebResponse getWeb();

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebResponse }
     *     
     */
    void setWeb(WebResponse value);

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
