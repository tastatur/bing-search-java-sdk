
package com.google.code.bing.search.schema.adapter.json.news;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsRelatedSearch;
import com.google.code.bing.search.schema.news.RelatedSearches;
public class RelatedSearchesImpl
    extends BaseAdapter implements RelatedSearches, Adaptable<RelatedSearches, JSONArray>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsRelatedSearch> newsRelatedSearchList;

    public List<NewsRelatedSearch> getNewsRelatedSearchList() {
        if (newsRelatedSearchList == null) {
            newsRelatedSearchList = new ArrayList<NewsRelatedSearch>();
        }
        return this.newsRelatedSearchList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (NewsRelatedSearch o : getNewsRelatedSearchList()) {
			adapter.add(((NewsRelatedSearchImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			NewsRelatedSearchImpl result = new NewsRelatedSearchImpl();
			result.adaptFrom((JSONObject) o);
			getNewsRelatedSearchList().add(result);
		}
	}
}
