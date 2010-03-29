
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.news.NewsCollection;
import com.google.code.bing.search.schema.news.NewsCollections;
public class NewsCollectionsImpl
    implements Serializable, NewsCollections, Adaptable<NewsCollections, com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollections>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollections toAdaptee(
			NewsCollections adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewsCollections toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollections adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
