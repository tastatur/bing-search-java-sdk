
package com.google.code.bing.search.schema.adapter.json.ads;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.ads.AdResponse;
import com.google.code.bing.search.schema.ads.Results;

public class AdImpl
    extends BaseAdapter implements AdResponse, Adaptable<AdResponse, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long pageNumber;
    protected Double adApiVersion;
    protected ResultsImpl results;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long value) {
        this.pageNumber = value;
    }

    public Double getAdApiVersion() {
        return adApiVersion;
    }

    public void setAdApiVersion(Double value) {
        this.adApiVersion = value;
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
		copyProperties(adapter , this);
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
			results.adaptFrom((JSONObject) adaptee.get("Results"));
			setResults(results);
		}
	}
}
