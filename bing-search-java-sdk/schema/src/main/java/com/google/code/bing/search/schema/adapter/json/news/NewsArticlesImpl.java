
package com.google.code.bing.search.schema.adapter.json.news;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsArticle;
import com.google.code.bing.search.schema.news.NewsArticles;
public class NewsArticlesImpl
    extends BaseAdapter implements NewsArticles, Adaptable<NewsArticles, com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticles>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticles adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticles adapter = new com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticles();
		copyProperties(adapter , this);
		for (NewsArticle o : getNewsArticleList()) {
			adapter.getNewsArticleList().add(((NewsArticleImpl) o).adaptTo());
		}
		
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticles adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticle o : adaptee.getNewsArticleList()) {
			NewsArticleImpl result = new NewsArticleImpl();
			result.adaptFrom(o);
			getNewsArticleList().add(result);
		}
	}
}
