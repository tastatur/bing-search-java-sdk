
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsRelatedSearch;
import com.google.code.bing.search.schema.news.RelatedSearches;
public class RelatedSearchesImpl
    extends BaseAdapter implements RelatedSearches, Adaptable<RelatedSearches, com.microsoft.schemas.livesearch._2008._04.xml.news.RelatedSearches>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsRelatedSearch> newsRelatedSearchList;

    public List<NewsRelatedSearch> getNewsRelatedSearchList() {
        if (newsRelatedSearchList == null) {
            newsRelatedSearchList = new ArrayList<NewsRelatedSearch>();
        }
        return this.newsRelatedSearchList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.news.RelatedSearches adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.news.RelatedSearches adapter = new com.microsoft.schemas.livesearch._2008._04.xml.news.RelatedSearches();
		copyProperties(adapter, this);
		for (NewsRelatedSearch o : getNewsRelatedSearchList()) {
			adapter.getNewsRelatedSearchList().add(((NewsRelatedSearchImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.news.RelatedSearches adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.news.NewsRelatedSearch o : adaptee.getNewsRelatedSearchList()) {
			NewsRelatedSearchImpl result = new NewsRelatedSearchImpl();
			result.adaptFrom(o);
			getNewsRelatedSearchList().add(result);
		}
	}
}
