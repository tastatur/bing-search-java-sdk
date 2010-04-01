
package com.google.code.bing.search.schema.adapter.json.news;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsResult;
import com.google.code.bing.search.schema.news.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONArray>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsResult> newsResultList;

    public List<NewsResult> getNewsResultList() {
        if (newsResultList == null) {
            newsResultList = new ArrayList<NewsResult>();
        }
        return this.newsResultList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (NewsResult o : getNewsResultList()) {
			adapter.add(((NewsResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			NewsResultImpl result = new NewsResultImpl();
			result.adaptFrom((JSONObject) o);
			getNewsResultList().add(result);
		}
	}
}
