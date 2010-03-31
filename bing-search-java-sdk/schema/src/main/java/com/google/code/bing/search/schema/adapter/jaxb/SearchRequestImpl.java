
package com.google.code.bing.search.schema.adapter.jaxb;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.AdultOption;
import com.google.code.bing.search.schema.SearchOption;
import com.google.code.bing.search.schema.SearchRequest;
import com.google.code.bing.search.schema.SourceType;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.mobileweb.MobileWebRequest;
import com.google.code.bing.search.schema.multimedia.ImageRequest;
import com.google.code.bing.search.schema.multimedia.VideoRequest;
import com.google.code.bing.search.schema.news.NewsRequest;
import com.google.code.bing.search.schema.phonebook.PhonebookRequest;
import com.google.code.bing.search.schema.translation.TranslationRequest;
import com.google.code.bing.search.schema.web.WebRequest;

public class SearchRequestImpl 
	extends BaseAdapter implements SearchRequest {

    /**
	 * 
	 */
	private static final long serialVersionUID = 855215031708252888L;
	protected String version;
    protected String market;
    protected String uiLanguage;
    protected String query;
    protected String appId;
    protected AdultOption adult;
    protected Double latitude;
    protected Double longitude;
    protected Double radius;
    protected WebRequest web;
    protected ImageRequest image;
    protected PhonebookRequest phonebook;
    protected VideoRequest video;
    protected NewsRequest news;
    protected MobileWebRequest mobileWeb;
    protected TranslationRequest translation;
    protected List<SearchOption> searchOptionList;
    protected List<SourceType> sourceTypeList;

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
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link WebRequest }
     *     
     */
    public WebRequest getWebRequest() {
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
    public void setWebRequest(WebRequest value) {
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
    public ImageRequest getImageRequest() {
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
    public void setImageRequest(ImageRequest value) {
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
    public PhonebookRequest getPhonebookRequest() {
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
    public void setPhonebookRequest(PhonebookRequest value) {
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
    public VideoRequest getVideoRequest() {
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
    public void setVideoRequest(VideoRequest value) {
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
    public NewsRequest getNewsRequest() {
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
    public void setNewsRequest(NewsRequest value) {
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
    public MobileWebRequest getMobileWebRequest() {
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
    public void setMobileWebRequest(MobileWebRequest value) {
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
    public TranslationRequest getTranslationRequest() {
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
    public void setTranslationRequest(TranslationRequest value) {
        this.translation = value;
    }

	@Override
	public List<SearchOption> getSearchOptionList() {
		if (searchOptionList == null) {
			searchOptionList = new ArrayList<SearchOption>();
		}
		return searchOptionList;
	}

	@Override
	public List<SourceType> getSourceTypeList() {
		if (sourceTypeList == null) {
			sourceTypeList = new ArrayList<SourceType>();
		}
		return sourceTypeList;
	}

	@Override
	public void setSearchOptionList(List<SearchOption> searchOption) {
		searchOptionList = searchOption;
	}

	@Override
	public void setSourceTypeList(List<SourceType> value) {
		sourceTypeList = value;
	}
}
