
package com.google.code.bing.search.schema.adapter.json.web;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.SearchTags;
import com.google.code.bing.search.schema.web.WebSearchTag;
public class SearchTagsImpl
    extends BaseAdapter implements SearchTags, Adaptable<SearchTags, JSONArray>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<WebSearchTag> webSearchTagList;

    public List<WebSearchTag> getWebSearchTagList() {
        if (webSearchTagList == null) {
            webSearchTagList = new ArrayList<WebSearchTag>();
        }
        return this.webSearchTagList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (WebSearchTag o : getWebSearchTagList()) {
			adapter.add(((WebSearchTagImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			WebSearchTagImpl result = new WebSearchTagImpl();
			result.adaptFrom((JSONObject) o);
			getWebSearchTagList().add(result);
		}
	}
}
