
package com.google.code.bing.search.schema.adapter.json.news;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsArticles;
import com.google.code.bing.search.schema.news.NewsCollection;
public class NewsCollectionImpl
    extends BaseAdapter implements NewsCollection, Adaptable<NewsCollection, JSONObject>
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

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		if (getNewsArticles() != null) {
			adapter.put("NewsArticles", ((NewsArticlesImpl) getNewsArticles()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.get("NewsArticles") != null) {
			NewsArticlesImpl results = new NewsArticlesImpl();
			results.adaptFrom((JSONArray) adaptee.get("NewsArticles"));
			setNewsArticles(results);
		}
	}
}
