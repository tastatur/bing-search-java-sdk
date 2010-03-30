
package com.google.code.bing.search.schema.adapter.jaxb.news;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsRelatedSearch;
public class NewsRelatedSearchImpl
    extends BaseAdapter implements NewsRelatedSearch, Adaptable<NewsRelatedSearch, com.microsoft.schemas.livesearch._2008._04.xml.news.NewsRelatedSearch>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.news.NewsRelatedSearch adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.news.NewsRelatedSearch adapter = new com.microsoft.schemas.livesearch._2008._04.xml.news.NewsRelatedSearch();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.news.NewsRelatedSearch adaptee) {
		copyProperties(this, adaptee);
	}
}
