
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.news.NewsRelatedSearch;
public class NewsRelatedSearchImpl
    implements Serializable, NewsRelatedSearch, Adaptable<NewsRelatedSearch, com.microsoft.schemas.livesearch._2008._04.xml.news.NewsRelatedSearch>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.news.NewsRelatedSearch toAdaptee(
			NewsRelatedSearch adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewsRelatedSearch toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.news.NewsRelatedSearch adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
