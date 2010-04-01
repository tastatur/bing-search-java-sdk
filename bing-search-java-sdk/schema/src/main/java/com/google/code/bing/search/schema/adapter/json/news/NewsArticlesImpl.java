
package com.google.code.bing.search.schema.adapter.json.news;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsArticle;
import com.google.code.bing.search.schema.news.NewsArticles;
public class NewsArticlesImpl
    extends BaseAdapter implements NewsArticles, Adaptable<NewsArticles, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsArticle> newsArticleList;

    public List<NewsArticle> getNewsArticleList() {
        if (newsArticleList == null) {
            newsArticleList = new ArrayList<NewsArticle>();
        }
        return this.newsArticleList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter , this);
		for (NewsArticle o : getNewsArticleList()) {
			(getJSONArray(adapter, "NewsArticle")).add(((NewsArticleImpl) o).adaptTo());
		}
		
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (Object o : getJSONArray(adaptee, "NewsArticle")) {
			NewsArticleImpl result = new NewsArticleImpl();
			result.adaptFrom((JSONObject) o);
			getNewsArticleList().add(result);
		}
	}
}
