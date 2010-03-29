
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.news.NewsRelatedSearch;
import com.google.code.bing.search.schema.news.RelatedSearches;
public class RelatedSearchesImpl
    implements Serializable, RelatedSearches
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsRelatedSearch> newsRelatedSearchList;

    public List<NewsRelatedSearch> getNewsRelatedSearchList() {
        if (newsRelatedSearchList == null) {
            newsRelatedSearchList = new ArrayList<NewsRelatedSearch>();
        }
        return this.newsRelatedSearchList;
    }

}