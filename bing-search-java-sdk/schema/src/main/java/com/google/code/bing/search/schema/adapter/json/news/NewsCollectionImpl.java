
package com.google.code.bing.search.schema.adapter.json.news;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsArticles;
import com.google.code.bing.search.schema.news.NewsCollection;
public class NewsCollectionImpl
    extends BaseAdapter implements NewsCollection, Adaptable<NewsCollection, com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollection>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollection adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollection adapter = new com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollection();
		copyProperties(adapter, this);
		if (getNewsArticles() != null) {
			adapter.setNewsArticles(((NewsArticlesImpl) getNewsArticles()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.news.NewsCollection adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getNewsArticles() != null) {
			NewsArticlesImpl results = new NewsArticlesImpl();
			results.adaptFrom(adaptee.getNewsArticles());
			setNewsArticles(results);
		}
	}
}
