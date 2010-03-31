
package com.google.code.bing.search.schema.adapter.json.multimedia;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.VideoResponse;
import com.google.code.bing.search.schema.multimedia.VideoResults;
public class VideoImpl
    extends BaseAdapter implements VideoResponse, Adaptable<VideoResponse, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long offset;
    protected VideoResultsImpl results;

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

    public VideoResults getResults() {
        return results;
    }

    public void setResults(VideoResults value) {
        this.results = ((VideoResultsImpl) value);
    }

	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter , this);
		if (getResults() != null) {
			adapter.setResults(((VideoResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(JSONObject adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			VideoResultsImpl results = new VideoResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
	}
}
