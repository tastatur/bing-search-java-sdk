
package com.google.code.bing.search.schema.adapter.json.mobileweb;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.mobileweb.MobileWebResult;
import com.google.code.bing.search.schema.mobileweb.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONArray>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<MobileWebResult> mobileWebResultList;

    public List<MobileWebResult> getMobileWebResultList() {
        if (mobileWebResultList == null) {
            mobileWebResultList = new ArrayList<MobileWebResult>();
        }
        return this.mobileWebResultList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (MobileWebResult o : getMobileWebResultList()) {
			adapter.add(((MobileWebResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			MobileWebResultImpl result = new MobileWebResultImpl();
			result.adaptFrom((JSONObject) o);
			getMobileWebResultList().add(result);
		}
	}
}
