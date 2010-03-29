
package com.google.code.bing.search.schema.mobileweb.impl;

import java.io.Serializable;

import com.google.code.bing.search.schema.mobileweb.MobileWebResult;
public class MobileWebResultImpl
    implements Serializable, MobileWebResult
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String description;
    protected String url;
    protected String displayUrl;
    protected String dateTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String value) {
        this.displayUrl = value;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String value) {
        this.dateTime = value;
    }

}
