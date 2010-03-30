
package com.google.code.bing.search.schema.adapter.soap.multimedia;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.StaticThumbnail;
import com.google.code.bing.search.schema.multimedia.VideoResult;
public class VideoResultImpl
    extends BaseAdapter implements VideoResult, Adaptable<VideoResult, com.microsoft.schemas.livesearch._2008._04.xml.multimedia.VideoResult>
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

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.multimedia.VideoResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.multimedia.VideoResult adapter = new com.microsoft.schemas.livesearch._2008._04.xml.multimedia.VideoResult();
		copyProperties(adapter, this);
		if (getStaticThumbnail() != null) {
			adapter.setStaticThumbnail(((StaticThumbnailImpl) getStaticThumbnail()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.multimedia.VideoResult adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getStaticThumbnail() != null) {
			StaticThumbnailImpl results = new StaticThumbnailImpl();
			results.adaptFrom(adaptee.getStaticThumbnail());
			setStaticThumbnail(results);
		}
	}
}
