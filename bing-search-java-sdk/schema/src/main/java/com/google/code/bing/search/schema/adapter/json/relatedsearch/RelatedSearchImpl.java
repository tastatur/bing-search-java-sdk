
package com.google.code.bing.search.schema.adapter.json.relatedsearch;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResponse;
import com.google.code.bing.search.schema.relatedsearch.Results;
public class RelatedSearchImpl
    extends BaseAdapter implements RelatedSearchResponse, Adaptable<RelatedSearchResponse, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected ResultsImpl results;

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
	}
}
