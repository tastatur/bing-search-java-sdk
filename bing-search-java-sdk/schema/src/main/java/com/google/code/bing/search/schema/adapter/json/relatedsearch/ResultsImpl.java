
package com.google.code.bing.search.schema.adapter.json.relatedsearch;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResult;
import com.google.code.bing.search.schema.relatedsearch.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONArray>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<RelatedSearchResult> relatedSearchResultList;

    public List<RelatedSearchResult> getRelatedSearchResultList() {
        if (relatedSearchResultList == null) {
            relatedSearchResultList = new ArrayList<RelatedSearchResult>();
        }
        return this.relatedSearchResultList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (RelatedSearchResult o : getRelatedSearchResultList()) {
			adapter.add(((RelatedSearchResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			RelatedSearchResultImpl result = new RelatedSearchResultImpl();
			result.adaptFrom((JSONObject) o);
			getRelatedSearchResultList().add(result);
		}
	}
}
