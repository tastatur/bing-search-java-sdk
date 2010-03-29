
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;

import com.google.code.bing.search.schema.news.NewsArticles;
import com.google.code.bing.search.schema.news.NewsCollection;
public class NewsCollectionImpl
    implements Serializable, NewsCollection
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String name;
    protected NewsArticlesImpl newsArticles;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public NewsArticles getNewsArticles() {
        return newsArticles;
    }

    public void setNewsArticles(NewsArticles value) {
        this.newsArticles = ((NewsArticlesImpl) value);
    }

}
