
package com.google.code.bing.search.schema.adapter.jaxb;

import java.io.Serializable;

import com.google.code.bing.search.schema.Query;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.jaxb.ads.AdImpl;
import com.google.code.bing.search.schema.adapter.jaxb.instantanswer.InstantAnswerImpl;
import com.google.code.bing.search.schema.adapter.jaxb.mobileweb.MobileWebImpl;
import com.google.code.bing.search.schema.adapter.jaxb.multimedia.ImageImpl;
import com.google.code.bing.search.schema.adapter.jaxb.multimedia.VideoImpl;
import com.google.code.bing.search.schema.adapter.jaxb.news.NewsImpl;
import com.google.code.bing.search.schema.adapter.jaxb.phonebook.PhonebookImpl;
import com.google.code.bing.search.schema.adapter.jaxb.relatedsearch.RelatedSearchImpl;
import com.google.code.bing.search.schema.adapter.jaxb.spell.SpellImpl;
import com.google.code.bing.search.schema.adapter.jaxb.translation.TranslationImpl;
import com.google.code.bing.search.schema.adapter.jaxb.web.WebImpl;
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
public class SearchResponseImpl
    implements Serializable, SearchResponse, Adaptable<SearchResponse, com.microsoft.schemas.livesearch._2008._04.xml.element.SearchResponse>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected QueryImpl query;
    protected AdImpl ad;
    protected InstantAnswerImpl instantAnswer;
    protected MobileWebImpl mobileWeb;
    protected ImageImpl image;
    protected VideoImpl video;
    protected PhonebookImpl phonebook;
    protected RelatedSearchImpl relatedSearch;
    protected SpellImpl spell;
    protected NewsImpl news;
    protected TranslationImpl translation;
    protected WebImpl web;
    protected Double version;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query value) {
        this.query = ((QueryImpl) value);
    }

    public AdResponse getAd() {
        return ad;
    }

    public void setAd(AdResponse value) {
        this.ad = ((AdImpl) value);
    }

    public InstantAnswerResponse getInstantAnswer() {
        return instantAnswer;
    }

    public void setInstantAnswer(InstantAnswerResponse value) {
        this.instantAnswer = ((InstantAnswerImpl) value);
    }

    public MobileWebResponse getMobileWeb() {
        return mobileWeb;
    }

    public void setMobileWeb(MobileWebResponse value) {
        this.mobileWeb = ((MobileWebImpl) value);
    }

    public ImageResponse getImage() {
        return image;
    }

    public void setImage(ImageResponse value) {
        this.image = ((ImageImpl) value);
    }

    public VideoResponse getVideo() {
        return video;
    }

    public void setVideo(VideoResponse value) {
        this.video = ((VideoImpl) value);
    }

    public PhonebookResponse getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(PhonebookResponse value) {
        this.phonebook = ((PhonebookImpl) value);
    }

    public RelatedSearchResponse getRelatedSearch() {
        return relatedSearch;
    }

    public void setRelatedSearch(RelatedSearchResponse value) {
        this.relatedSearch = ((RelatedSearchImpl) value);
    }

    public SpellResponse getSpell() {
        return spell;
    }

    public void setSpell(SpellResponse value) {
        this.spell = ((SpellImpl) value);
    }

    public NewsResponse getNews() {
        return news;
    }

    public void setNews(NewsResponse value) {
        this.news = ((NewsImpl) value);
    }

    public TranslationResponse getTranslation() {
        return translation;
    }

    public void setTranslation(TranslationResponse value) {
        this.translation = ((TranslationImpl) value);
    }

    public WebResponse getWeb() {
        return web;
    }

    public void setWeb(WebResponse value) {
        this.web = ((WebImpl) value);
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double value) {
        this.version = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.element.SearchResponse toAdaptee(
			SearchResponse adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchResponse toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.element.SearchResponse adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
