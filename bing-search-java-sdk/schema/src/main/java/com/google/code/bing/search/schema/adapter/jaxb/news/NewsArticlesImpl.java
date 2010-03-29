
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.news.NewsArticle;
import com.google.code.bing.search.schema.news.NewsArticles;
public class NewsArticlesImpl
    implements Serializable, NewsArticles, Adaptable<NewsArticles, com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticles>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticles toAdaptee(
			NewsArticles adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewsArticles toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticles adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
