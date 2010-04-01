
package com.google.code.bing.search.schema.adapter.json.news;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsCollection;
import com.google.code.bing.search.schema.news.NewsCollections;
public class NewsCollectionsImpl
    extends BaseAdapter implements NewsCollections, Adaptable<NewsCollections, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsCollection> newsCollectionList;

    public List<NewsCollection> getNewsCollectionList() {
        if (newsCollectionList == null) {
            newsCollectionList = new ArrayList<NewsCollection>();
        }
        return this.newsCollectionList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		for (NewsCollection o : getNewsCollectionList()) {
			(getJSONArray(adapter, "NewsCollection")).add(((NewsCollectionImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (Object o : getJSONArray(adaptee, "NewsCollection")) {
			NewsCollectionImpl result = new NewsCollectionImpl();
			result.adaptFrom((JSONObject) o);
			getNewsCollectionList().add(result);
		}
	}
}
