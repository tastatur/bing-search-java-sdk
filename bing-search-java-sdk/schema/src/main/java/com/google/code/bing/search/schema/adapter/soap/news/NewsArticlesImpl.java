
package com.google.code.bing.search.schema.adapter.soap.news;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsArticle;
import com.google.code.bing.search.schema.news.NewsArticles;
public class NewsArticlesImpl
    extends BaseAdapter implements NewsArticles, Adaptable<NewsArticles, com.microsoft.schemas.livesearch._2008._03.search.ArrayOfNewsArticle>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsArticle> newsArticleList;

    public List<NewsArticle> getNewsArticleList() {
        if (newsArticleList == null) {
            newsArticleList = new ArrayList<NewsArticle>();
        }
        return this.newsArticleList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.ArrayOfNewsArticle adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ArrayOfNewsArticle adapter = new com.microsoft.schemas.livesearch._2008._03.search.ArrayOfNewsArticle();
		copyProperties(adapter , this);
		for (NewsArticle o : getNewsArticleList()) {
			adapter.getNewsArticle().add(((NewsArticleImpl) o).adaptTo());
		}
		
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.ArrayOfNewsArticle adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._03.search.NewsArticle o : adaptee.getNewsArticle()) {
			NewsArticleImpl result = new NewsArticleImpl();
			result.adaptFrom(o);
			getNewsArticleList().add(result);
		}
	}
}
