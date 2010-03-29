
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.news.NewsArticle;
public class NewsArticleImpl
    implements Serializable, NewsArticle, Adaptable<NewsArticle, com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticle>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String url;
    protected String source;
    protected String snippet;
    protected String date;

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

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticle toAdaptee(
			NewsArticle adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewsArticle toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.news.NewsArticle adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
