
package com.google.code.bing.search.schema.adapter.json.news;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsCollection;
import com.google.code.bing.search.schema.news.NewsCollections;
public class NewsCollectionsImpl
    extends BaseAdapter implements NewsCollections, Adaptable<NewsCollections, com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollections>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsCollection> newsCollectionList;

    public List<NewsCollection> getNewsCollectionList() {
        if (newsCollectionList == null) {
            newsCollectionList = new ArrayList<NewsCollection>();
        }
        return this.newsCollectionList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollections adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollections adapter = new com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollections();
		copyProperties(adapter, this);
		for (NewsCollection o : getNewsCollectionList()) {
			adapter.getNewsCollectionList().add(((NewsCollectionImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollections adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollection o : adaptee.getNewsCollectionList()) {
			NewsCollectionImpl result = new NewsCollectionImpl();
			result.adaptFrom(o);
			getNewsCollectionList().add(result);
		}
	}
}
