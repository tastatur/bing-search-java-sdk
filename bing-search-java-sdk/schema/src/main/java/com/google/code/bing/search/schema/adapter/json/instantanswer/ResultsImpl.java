
package com.google.code.bing.search.schema.adapter.json.instantanswer;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResult;
import com.google.code.bing.search.schema.instantanswer.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONArray>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<InstantAnswerResult> instantAnswerResultList;

    public List<InstantAnswerResult> getInstantAnswerResultList() {
        if (instantAnswerResultList == null) {
            instantAnswerResultList = new ArrayList<InstantAnswerResult>();
        }
        return this.instantAnswerResultList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (InstantAnswerResult o : getInstantAnswerResultList()) {
			adapter.add(((InstantAnswerResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			InstantAnswerResultImpl result = new InstantAnswerResultImpl();
			result.adaptFrom((JSONObject) o);
			getInstantAnswerResultList().add(result);
		}
	}
}
