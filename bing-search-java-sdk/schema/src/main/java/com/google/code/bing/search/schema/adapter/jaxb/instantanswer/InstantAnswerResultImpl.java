
package com.google.code.bing.search.schema.adapter.jaxb.instantanswer;

import java.io.Serializable;

import com.google.code.bing.search.schema.instantanswer.InstantAnswerResult;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerSpecificData;
public class InstantAnswerResultImpl
    implements Serializable, InstantAnswerResult
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String contentType;
    protected String title;
    protected String clickThroughUrl;
    protected String url;
    protected String attribution;
    protected InstantAnswerSpecificDataImpl instantAnswerSpecificData;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String value) {
        this.contentType = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getClickThroughUrl() {
        return clickThroughUrl;
    }

    public void setClickThroughUrl(String value) {
        this.clickThroughUrl = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String value) {
        this.attribution = value;
    }

    public InstantAnswerSpecificData getInstantAnswerSpecificData() {
        return instantAnswerSpecificData;
    }

    public void setInstantAnswerSpecificData(InstantAnswerSpecificData value) {
        this.instantAnswerSpecificData = ((InstantAnswerSpecificDataImpl) value);
    }

}
