
package com.google.code.bing.search.schema.news.impl;

import java.io.Serializable;

import com.google.code.bing.search.schema.news.NewsRelatedSearch;
public class NewsRelatedSearchImpl
    implements Serializable, NewsRelatedSearch
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

}
