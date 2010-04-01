
package com.google.code.bing.search.schema.adapter.json.web;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.Results;
import com.google.code.bing.search.schema.web.WebResult;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONArray>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<WebResult> webResultList;

    public List<WebResult> getWebResultList() {
        if (webResultList == null) {
            webResultList = new ArrayList<WebResult>();
        }
        return this.webResultList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (WebResult o : getWebResultList()) {
			adapter.add(((WebResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			WebResultImpl result = new WebResultImpl();
			result.adaptFrom((JSONObject) o);
			getWebResultList().add(result);
		}
	}
}
