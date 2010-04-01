
package com.google.code.bing.search.schema.adapter.json.mobileweb;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.mobileweb.MobileWebResult;
import com.google.code.bing.search.schema.mobileweb.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONObject>
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
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter  , this);
		for (MobileWebResult o : getMobileWebResultList()) {
			(getJSONArray(adapter, "MobileWebResult")).add(((MobileWebResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (Object o : getJSONArray(adaptee, "MobileWebResult")) {
			MobileWebResultImpl result = new MobileWebResultImpl();
			result.adaptFrom((JSONObject) o);
			getMobileWebResultList().add(result);
		}
	}
}
