
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
    extends BaseAdapter implements Results, Adaptable<Results, JSONObject>
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
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter   , this);
		for (AdResult o : getAdResultList()) {
			((JSONArray)adapter.get("AdResult")).add(((AdResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (Object o : getJSONArray(adaptee, "AdResult")) {
			AdResultImpl result = new AdResultImpl();
			result.adaptFrom((JSONObject) o);
			getAdResultList().add(result);
		}
	}
}
