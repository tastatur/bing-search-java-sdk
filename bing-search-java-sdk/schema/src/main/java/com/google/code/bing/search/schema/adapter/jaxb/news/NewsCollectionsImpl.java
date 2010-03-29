
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.news.NewsCollection;
import com.google.code.bing.search.schema.news.NewsCollections;
public class NewsCollectionsImpl
    implements Serializable, NewsCollections
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsCollection> newsCollectionList;

    public List<NewsCollection> getNewsCollectionList() {
        if (newsCollectionList == null) {
            newsCollectionList = new ArrayList<NewsCollection>();
        }
        return this.newsCollectionList;
    }

}
