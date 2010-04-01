
package com.google.code.bing.search.schema.adapter.json.multimedia;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.StaticThumbnail;
import com.google.code.bing.search.schema.multimedia.VideoResult;
public class VideoResultImpl
    extends BaseAdapter implements VideoResult, Adaptable<VideoResult, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String playUrl;
    protected String sourceTitle;
    protected Long runTime;
    protected String clickThroughPageUrl;
    protected StaticThumbnailImpl staticThumbnail;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String value) {
        this.playUrl = value;
    }

    public String getSourceTitle() {
        return sourceTitle;
    }

    public void setSourceTitle(String value) {
        this.sourceTitle = value;
    }

    public Long getRunTime() {
        return runTime;
    }

    public void setRunTime(Long value) {
        this.runTime = value;
    }

    public String getClickThroughPageUrl() {
        return clickThroughPageUrl;
    }

    public void setClickThroughPageUrl(String value) {
        this.clickThroughPageUrl = value;
    }

    public StaticThumbnail getStaticThumbnail() {
        return staticThumbnail;
    }

    public void setStaticThumbnail(StaticThumbnail value) {
        this.staticThumbnail = ((StaticThumbnailImpl) value);
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		if (getStaticThumbnail() != null) {
			adapter.put("StaticThumbnail", ((StaticThumbnailImpl) getStaticThumbnail()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.get("StaticThumbnail") != null) {
			StaticThumbnailImpl results = new StaticThumbnailImpl();
			results.adaptFrom((JSONObject) adaptee.get("StaticThumbnail"));
			setStaticThumbnail(results);
		}
	}
}
