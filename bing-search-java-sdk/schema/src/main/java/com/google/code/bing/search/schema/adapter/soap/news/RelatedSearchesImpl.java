
package com.google.code.bing.search.schema.adapter.soap.news;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsRelatedSearch;
import com.google.code.bing.search.schema.news.RelatedSearches;
public class RelatedSearchesImpl
    extends BaseAdapter implements RelatedSearches, Adaptable<RelatedSearches, com.microsoft.schemas.livesearch._2008._03.search.ArrayOfNewsRelatedSearch>
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
	public com.microsoft.schemas.livesearch._2008._03.search.ArrayOfNewsRelatedSearch adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ArrayOfNewsRelatedSearch adapter = new com.microsoft.schemas.livesearch._2008._03.search.ArrayOfNewsRelatedSearch();
		copyProperties(adapter, this);
		for (NewsRelatedSearch o : getNewsRelatedSearchList()) {
			adapter.getNewsRelatedSearch().add(((NewsRelatedSearchImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.ArrayOfNewsRelatedSearch adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._03.search.NewsRelatedSearch o : adaptee.getNewsRelatedSearch()) {
			NewsRelatedSearchImpl result = new NewsRelatedSearchImpl();
			result.adaptFrom(o);
			getNewsRelatedSearchList().add(result);
		}
	}
}
