
package com.google.code.bing.search.schema.adapter.json.web;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.SearchTags;
import com.google.code.bing.search.schema.web.WebSearchTag;
public class SearchTagsImpl
    extends BaseAdapter implements SearchTags, Adaptable<SearchTags, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<WebSearchTag> webSearchTagList;

    public List<WebSearchTag> getWebSearchTagList() {
        if (webSearchTagList == null) {
            webSearchTagList = new ArrayList<WebSearchTag>();
        }
        return this.webSearchTagList;
    }

	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		for (WebSearchTag o : getWebSearchTagList()) {
			adapter.getWebSearchTagList().add(((WebSearchTagImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.web.WebSearchTag o : adaptee.getWebSearchTagList()) {
			WebSearchTagImpl result = new WebSearchTagImpl();
			result.adaptFrom(o);
			getWebSearchTagList().add(result);
		}
	}
}
