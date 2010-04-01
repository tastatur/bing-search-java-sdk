
package com.google.code.bing.search.schema.adapter.json.news;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsArticle;
import com.google.code.bing.search.schema.news.NewsArticles;
public class NewsArticlesImpl
    extends BaseAdapter implements NewsArticles, Adaptable<NewsArticles, JSONArray>
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
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (NewsArticle o : getNewsArticleList()) {
			adapter.add(((NewsArticleImpl) o).adaptTo());
		}
		
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			NewsArticleImpl result = new NewsArticleImpl();
			result.adaptFrom((JSONObject) o);
			getNewsArticleList().add(result);
		}
	}
}
