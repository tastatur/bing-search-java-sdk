
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.news.NewsArticles;
import com.google.code.bing.search.schema.news.NewsCollection;
public class NewsCollectionImpl
    implements Serializable, NewsCollection, Adaptable<NewsCollection, com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollection>
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

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollection toAdaptee(
			NewsCollection adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewsCollection toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollection adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
