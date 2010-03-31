
package com.google.code.bing.search.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.Query;
import com.google.code.bing.search.schema.SearchResponse;
import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
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

	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter , this);
		if (getQuery() != null) {
			adapter.setQuery(((QueryImpl) getQuery()).adaptTo());
		}
		if (getAd() != null) {
			adapter.setAd(((AdImpl) getAd()).adaptTo());
		}
		if (getInstantAnswer() != null) {
			adapter.setInstantAnswer(((InstantAnswerImpl) getInstantAnswer()).adaptTo());
		}
		if (getMobileWeb() != null) {
			adapter.setMobileWeb(((MobileWebImpl) getMobileWeb()).adaptTo());
		}
		if (getImage() != null) {
			adapter.setImage(((ImageImpl) getImage()).adaptTo());
		}
		if (getVideo() != null) {
			adapter.setVideo(((VideoImpl) getVideo()).adaptTo());
		}
		if (getPhonebook() != null) {
			adapter.setPhonebook(((PhonebookImpl) getPhonebook()).adaptTo());
		}
		if (getRelatedSearch() != null) {
			adapter.setRelatedSearch(((RelatedSearchImpl) getRelatedSearch()).adaptTo());
		}
		if (getSpell() != null) {
			adapter.setSpell(((SpellImpl) getSpell()).adaptTo());
		}
		if (getNews() != null) {
			adapter.setNews(((NewsImpl) getNews()).adaptTo());
		}
		if (getTranslation() != null) {
			adapter.setTranslation(((TranslationImpl) getTranslation()).adaptTo());
		}
		if (getWeb() != null) {
			adapter.setWeb(((WebImpl) getWeb()).adaptTo());
		}
		
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getQuery() != null) {
			QueryImpl results = new QueryImpl();
			results.adaptFrom(adaptee.getQuery());
			setQuery(results);
		}
		if (adaptee.getAd() != null) {
			AdImpl results = new AdImpl();
			results.adaptFrom(adaptee.getAd());
			setAd(results);
		}
		if (adaptee.getInstantAnswer() != null) {
			InstantAnswerImpl results = new InstantAnswerImpl();
			results.adaptFrom(adaptee.getInstantAnswer());
			setInstantAnswer(results);
		}
		if (adaptee.getMobileWeb() != null) {
			MobileWebImpl results = new MobileWebImpl();
			results.adaptFrom(adaptee.getMobileWeb());
			setMobileWeb(results);
		}
		if (adaptee.getImage() != null) {
			ImageImpl results = new ImageImpl();
			results.adaptFrom(adaptee.getImage());
			setImage(results);
		}
		if (adaptee.getVideo() != null) {
			VideoImpl results = new VideoImpl();
			results.adaptFrom(adaptee.getVideo());
			setVideo(results);
		}
		if (adaptee.getPhonebook() != null) {
			PhonebookImpl results = new PhonebookImpl();
			results.adaptFrom(adaptee.getPhonebook());
			setPhonebook(results);
		}
		if (adaptee.getRelatedSearch() != null) {
			RelatedSearchImpl results = new RelatedSearchImpl();
			results.adaptFrom(adaptee.getRelatedSearch());
			setRelatedSearch(results);
		}
		if (adaptee.getSpell() != null) {
			SpellImpl results = new SpellImpl();
			results.adaptFrom(adaptee.getSpell());
			setSpell(results);
		}
		if (adaptee.getNews() != null) {
			NewsImpl results = new NewsImpl();
			results.adaptFrom(adaptee.getNews());
			setNews(results);
		}
		if (adaptee.getTranslation() != null) {
			TranslationImpl results = new TranslationImpl();
			results.adaptFrom(adaptee.getTranslation());
			setTranslation(results);
		}
		if (adaptee.getWeb() != null) {
			WebImpl results = new WebImpl();
			results.adaptFrom(adaptee.getWeb());
			setWeb(results);
		}
	}
}
