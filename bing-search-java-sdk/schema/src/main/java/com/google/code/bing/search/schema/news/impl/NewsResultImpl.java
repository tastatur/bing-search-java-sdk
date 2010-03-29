
package com.google.code.bing.search.schema.news.impl;

import java.io.Serializable;

import com.google.code.bing.search.schema.news.NewsCollections;
import com.google.code.bing.search.schema.news.NewsResult;
public class NewsResultImpl
    implements Serializable, NewsResult
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String url;
    protected String source;
    protected String snippet;
    protected String date;
    protected Long breakingNews;
    protected NewsCollectionsImpl newsCollections;

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

    public String getSource() {
        return source;
    }

    public void setSource(String value) {
        this.source = value;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String value) {
        this.snippet = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String value) {
        this.date = value;
    }

    public Long getBreakingNews() {
        return breakingNews;
    }

    public void setBreakingNews(Long value) {
        this.breakingNews = value;
    }

    public NewsCollections getNewsCollections() {
        return newsCollections;
    }

    public void setNewsCollections(NewsCollections value) {
        this.newsCollections = ((NewsCollectionsImpl) value);
    }

}
