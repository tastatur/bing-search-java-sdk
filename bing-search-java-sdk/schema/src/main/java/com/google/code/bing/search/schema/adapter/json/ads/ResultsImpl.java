
package com.google.code.bing.search.schema.adapter.json.ads;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.ads.AdResult;
import com.google.code.bing.search.schema.ads.Results;

public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONArray>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<AdResult> adResultList;

    public List<AdResult> getAdResultList() {
        if (adResultList == null) {
            adResultList = new ArrayList<AdResult>();
        }
        return this.adResultList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (AdResult o : getAdResultList()) {
			adapter.add(((AdResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			AdResultImpl result = new AdResultImpl();
			result.adaptFrom((JSONObject) o);
			getAdResultList().add(result);
		}
	}
}
