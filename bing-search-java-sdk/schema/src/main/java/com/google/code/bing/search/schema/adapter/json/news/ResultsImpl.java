
package com.google.code.bing.search.schema.adapter.json.news;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsResult;
import com.google.code.bing.search.schema.news.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsResult> newsResultList;

    public List<NewsResult> getNewsResultList() {
        if (newsResultList == null) {
            newsResultList = new ArrayList<NewsResult>();
        }
        return this.newsResultList;
    }

	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		for (NewsResult o : getNewsResultList()) {
			adapter.getNewsResultList().add(((NewsResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.news.NewsResult o : adaptee.getNewsResultList()) {
			NewsResultImpl result = new NewsResultImpl();
			result.adaptFrom(o);
			getNewsResultList().add(result);
		}
	}
}
