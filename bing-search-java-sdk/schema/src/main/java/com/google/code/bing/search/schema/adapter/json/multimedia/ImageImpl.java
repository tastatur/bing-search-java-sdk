
package com.google.code.bing.search.schema.adapter.json.multimedia;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageResponse;
import com.google.code.bing.search.schema.multimedia.ImageResults;
public class ImageImpl
    extends BaseAdapter implements ImageResponse, Adaptable<ImageResponse, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long offset;
    protected ImageResultsImpl results;

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

    public ImageResults getResults() {
        return results;
    }

    public void setResults(ImageResults value) {
        this.results = ((ImageResultsImpl) value);
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		if (getResults() != null) {
			adapter.put("Results", ((ImageResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.get("Results") != null) {
			ImageResultsImpl results = new ImageResultsImpl();
			results.adaptFrom((JSONObject) adaptee.get("Results"));
			setResults(results);
		}
	}
}
