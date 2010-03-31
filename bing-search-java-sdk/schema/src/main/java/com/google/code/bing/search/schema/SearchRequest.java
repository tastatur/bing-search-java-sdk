package com.google.code.bing.search.schema;

import java.util.List;

import com.google.code.bing.search.schema.mobileweb.MobileWebRequest;
import com.google.code.bing.search.schema.multimedia.ImageRequest;
import com.google.code.bing.search.schema.multimedia.VideoRequest;
import com.google.code.bing.search.schema.news.NewsRequest;
import com.google.code.bing.search.schema.phonebook.PhonebookRequest;
import com.google.code.bing.search.schema.translation.TranslationRequest;
import com.google.code.bing.search.schema.web.WebRequest;

public interface SearchRequest 
	extends SchemaEntity
{

	/**
	 * Gets the value of the version property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getVersion();

	/**
	 * Sets the value of the version property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setVersion(String value);

	/**
	 * Gets the value of the market property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getMarket();

	/**
	 * Sets the value of the market property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setMarket(String value);

	/**
	 * Gets the value of the uiLanguage property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getUILanguage();

	/**
	 * Sets the value of the uiLanguage property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setUILanguage(String value);

	/**
	 * Gets the value of the query property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getQuery();

	/**
	 * Sets the value of the query property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setQuery(String value);

	/**
	 * Gets the value of the appId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getAppId();

	/**
	 * Sets the value of the appId property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setAppId(String value);

	/**
	 * Gets the value of the adult property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link AdultOption }
	 *     
	 */
	public AdultOption getAdult();

	/**
	 * Sets the value of the adult property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link AdultOption }
	 *     
	 */
	public void setAdult(AdultOption value);

	/**
	 * Gets the value of the latitude property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public Double getLatitude();

	/**
	 * Sets the value of the latitude property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Double }
	 *     
	 */
	public void setLatitude(Double value);

	/**
	 * Gets the value of the longitude property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public Double getLongitude();

	/**
	 * Sets the value of the longitude property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Double }
	 *     
	 */
	public void setLongitude(Double value);

	/**
	 * Gets the value of the radius property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public Double getRadius();

	/**
	 * Sets the value of the radius property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Double }
	 *     
	 */
	public void setRadius(Double value);

	public List<SearchOption> getSearchOptionList();

	public void setSearchOptionList(List<SearchOption> searchOption);

	public List<SourceType> getSourceTypeList();

	public void setSourceTypeList(List<SourceType> value);

	/**
	 * Gets the value of the web property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link WebRequest }
	 *     
	 */
	public WebRequest getWebRequest();

	/**
	 * Sets the value of the web property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link WebRequest }
	 *     
	 */
	public void setWebRequest(WebRequest value);

	/**
	 * Gets the value of the image property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ImageRequest }
	 *     
	 */
	public ImageRequest getImageRequest();

	/**
	 * Sets the value of the image property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link ImageRequest }
	 *     
	 */
	public void setImageRequest(ImageRequest value);

	/**
	 * Gets the value of the phonebook property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link PhonebookRequest }
	 *     
	 */
	public PhonebookRequest getPhonebookRequest();

	/**
	 * Sets the value of the phonebook property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link PhonebookRequest }
	 *     
	 */
	public void setPhonebookRequest(PhonebookRequest value);

	/**
	 * Gets the value of the video property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link VideoRequest }
	 *     
	 */
	public VideoRequest getVideoRequest();

	/**
	 * Sets the value of the video property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link VideoRequest }
	 *     
	 */
	public void setVideoRequest(VideoRequest value);

	/**
	 * Gets the value of the news property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link NewsRequest }
	 *     
	 */
	public NewsRequest getNewsRequest();

	/**
	 * Sets the value of the news property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link NewsRequest }
	 *     
	 */
	public void setNewsRequest(NewsRequest value);

	/**
	 * Gets the value of the mobileWeb property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link MobileWebRequest }
	 *     
	 */
	public MobileWebRequest getMobileWebRequest();

	/**
	 * Sets the value of the mobileWeb property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link MobileWebRequest }
	 *     
	 */
	public void setMobileWebRequest(MobileWebRequest value);

	/**
	 * Gets the value of the translation property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link TranslationRequest }
	 *     
	 */
	public TranslationRequest getTranslationRequest();

	/**
	 * Sets the value of the translation property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link TranslationRequest }
	 *     
	 */
	public void setTranslationRequest(TranslationRequest value);

}