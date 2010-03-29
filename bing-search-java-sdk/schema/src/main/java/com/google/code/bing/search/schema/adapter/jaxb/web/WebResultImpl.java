
package com.google.code.bing.search.schema.adapter.jaxb.web;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.web.DeepLinks;
import com.google.code.bing.search.schema.web.SearchTags;
import com.google.code.bing.search.schema.web.WebResult;
public class WebResultImpl
    implements Serializable, WebResult, Adaptable<WebResult, com.microsoft.schemas.livesearch._2008._04.xml.web.WebResult>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String title;
    protected String description;
    protected String url;
    protected String cacheUrl;
    protected String displayUrl;
    protected String dateTime;
    protected SearchTagsImpl searchTags;
    protected DeepLinksImpl deepLinks;

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

    public String getCacheUrl() {
        return cacheUrl;
    }

    public void setCacheUrl(String value) {
        this.cacheUrl = value;
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

    public SearchTags getSearchTags() {
        return searchTags;
    }

    public void setSearchTags(SearchTags value) {
        this.searchTags = ((SearchTagsImpl) value);
    }

    public DeepLinks getDeepLinks() {
        return deepLinks;
    }

    public void setDeepLinks(DeepLinks value) {
        this.deepLinks = ((DeepLinksImpl) value);
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.web.WebResult toAdaptee(
			WebResult adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebResult toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.web.WebResult adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
