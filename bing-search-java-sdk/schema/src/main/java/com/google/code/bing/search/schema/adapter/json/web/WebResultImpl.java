
package com.google.code.bing.search.schema.adapter.json.web;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.DeepLinks;
import com.google.code.bing.search.schema.web.SearchTags;
import com.google.code.bing.search.schema.web.WebResult;
public class WebResultImpl
    extends BaseAdapter implements WebResult, Adaptable<WebResult, JSONObject>
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

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		if (getSearchTags() != null) {
			adapter.put("SearchTags", ((SearchTagsImpl) getSearchTags()).adaptTo());
		}
		if (getDeepLinks() != null) {
			adapter.put("DeepLinks", ((DeepLinksImpl) getDeepLinks()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.get("SearchTags") != null) {
			SearchTagsImpl results = new SearchTagsImpl();
			results.adaptFrom((JSONObject) adaptee.get("SearchTags"));
			setSearchTags(results);
		}
		if (adaptee.get("DeepLinks") != null) {
			DeepLinksImpl results = new DeepLinksImpl();
			results.adaptFrom((JSONObject) adaptee.get("DeepLinks"));
			setDeepLinks(results);
		}
	}
}
