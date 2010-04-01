
package com.google.code.bing.search.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.Query;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.adapter.json.ads.AdImpl;
import com.google.code.bing.search.schema.adapter.json.instantanswer.InstantAnswerImpl;
import com.google.code.bing.search.schema.adapter.json.mobileweb.MobileWebImpl;
import com.google.code.bing.search.schema.adapter.json.multimedia.ImageImpl;
import com.google.code.bing.search.schema.adapter.json.multimedia.VideoImpl;
import com.google.code.bing.search.schema.adapter.json.news.NewsImpl;
import com.google.code.bing.search.schema.adapter.json.phonebook.PhonebookImpl;
import com.google.code.bing.search.schema.adapter.json.relatedsearch.RelatedSearchImpl;
import com.google.code.bing.search.schema.adapter.json.spell.SpellImpl;
import com.google.code.bing.search.schema.adapter.json.translation.TranslationImpl;
import com.google.code.bing.search.schema.adapter.json.web.WebImpl;
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
    extends BaseAdapter implements SearchResponse, Adaptable<SearchResponse, JSONObject>
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

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter , this);
		if (getQuery() != null) {
			adapter.put("Query", ((QueryImpl) getQuery()).adaptTo());
		}
		if (getAd() != null) {
			adapter.put("Ad", ((AdImpl) getAd()).adaptTo());
		}
		if (getInstantAnswer() != null) {
			adapter.put("InstantAnswer", ((InstantAnswerImpl) getInstantAnswer()).adaptTo());
		}
		if (getMobileWeb() != null) {
			adapter.put("MobileWeb", ((MobileWebImpl) getMobileWeb()).adaptTo());
		}
		if (getImage() != null) {
			adapter.put("Image", ((ImageImpl) getImage()).adaptTo());
		}
		if (getVideo() != null) {
			adapter.put("Video", ((VideoImpl) getVideo()).adaptTo());
		}
		if (getPhonebook() != null) {
			adapter.put("Phonebook", ((PhonebookImpl) getPhonebook()).adaptTo());
		}
		if (getRelatedSearch() != null) {
			adapter.put("RelatedSearch", ((RelatedSearchImpl) getRelatedSearch()).adaptTo());
		}
		if (getSpell() != null) {
			adapter.put("Spell", ((SpellImpl) getSpell()).adaptTo());
		}
		if (getNews() != null) {
			adapter.put("News", ((NewsImpl) getNews()).adaptTo());
		}
		if (getTranslation() != null) {
			adapter.put("Translation", ((TranslationImpl) getTranslation()).adaptTo());
		}
		if (getWeb() != null) {
			adapter.put("Web", ((WebImpl) getWeb()).adaptTo());
		}
		
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.get("Query") != null) {
			QueryImpl results = new QueryImpl();
			results.adaptFrom((JSONObject) adaptee.get("Query"));
			setQuery(results);
		}
		if (adaptee.get("Ad") != null) {
			AdImpl results = new AdImpl();
			results.adaptFrom((JSONObject) adaptee.get("Ad"));
			setAd(results);
		}
		if (adaptee.get("InstantAnswer") != null) {
			InstantAnswerImpl results = new InstantAnswerImpl();
			results.adaptFrom((JSONObject) adaptee.get("InstantAnswer"));
			setInstantAnswer(results);
		}
		if (adaptee.get("MobileWeb") != null) {
			MobileWebImpl results = new MobileWebImpl();
			results.adaptFrom((JSONObject) adaptee.get("MobileWeb"));
			setMobileWeb(results);
		}
		if (adaptee.get("Image") != null) {
			ImageImpl results = new ImageImpl();
			results.adaptFrom((JSONObject) adaptee.get("Image"));
			setImage(results);
		}
		if (adaptee.get("Video") != null) {
			VideoImpl results = new VideoImpl();
			results.adaptFrom((JSONObject) adaptee.get("Video"));
			setVideo(results);
		}
		if (adaptee.get("Phonebook") != null) {
			PhonebookImpl results = new PhonebookImpl();
			results.adaptFrom((JSONObject) adaptee.get("Phonebook"));
			setPhonebook(results);
		}
		if (adaptee.get("RelatedSearch") != null) {
			RelatedSearchImpl results = new RelatedSearchImpl();
			results.adaptFrom((JSONObject) adaptee.get("RelatedSearch"));
			setRelatedSearch(results);
		}
		if (adaptee.get("Spell") != null) {
			SpellImpl results = new SpellImpl();
			results.adaptFrom((JSONObject) adaptee.get("Spell"));
			setSpell(results);
		}
		if (adaptee.get("News") != null) {
			NewsImpl results = new NewsImpl();
			results.adaptFrom((JSONObject) adaptee.get("News"));
			setNews(results);
		}
		if (adaptee.get("Translation") != null) {
			TranslationImpl results = new TranslationImpl();
			results.adaptFrom((JSONObject) adaptee.get("Translation"));
			setTranslation(results);
		}
		if (adaptee.get("Web") != null) {
			WebImpl results = new WebImpl();
			results.adaptFrom((JSONObject) adaptee.get("Web"));
			setWeb(results);
		}
	}
}
