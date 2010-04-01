
package com.google.code.bing.search.schema.adapter.json.news;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsResponse;
import com.google.code.bing.search.schema.news.RelatedSearches;
import com.google.code.bing.search.schema.news.Results;
public class NewsImpl
    extends BaseAdapter implements NewsResponse, Adaptable<NewsResponse, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long offset;
    protected RelatedSearchesImpl relatedSearches;
    protected ResultsImpl results;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long value) {
        this.offset = value;
    }

    public RelatedSearches getRelatedSearches() {
        return relatedSearches;
    }

    public void setRelatedSearches(RelatedSearches value) {
        this.relatedSearches = ((RelatedSearchesImpl) value);
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		if (getResults() != null) {
			adapter.put("Results", ((ResultsImpl) getResults()).adaptTo());
		}
		if (getRelatedSearches() != null) {
			adapter.put("RelatedSearches", ((RelatedSearchesImpl) getRelatedSearches()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.get("Results") != null) {
			ResultsImpl results = new ResultsImpl();
			results.adaptFrom((JSONArray) adaptee.get("Results"));
			setResults(results);
		}
		if (adaptee.get("RelatedSearches") != null) {
			RelatedSearchesImpl results = new RelatedSearchesImpl();
			results.adaptFrom((JSONArray) adaptee.get("RelatedSearches"));
			setRelatedSearches(results);
		}
	}
}
