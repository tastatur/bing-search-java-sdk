
package com.google.code.bing.search.schema.adapter.jaxb.multimedia;

import java.io.Serializable;

import com.google.code.bing.search.schema.multimedia.StaticThumbnail;
import com.google.code.bing.search.schema.multimedia.VideoResult;
public class VideoResultImpl
    implements Serializable, VideoResult
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

}