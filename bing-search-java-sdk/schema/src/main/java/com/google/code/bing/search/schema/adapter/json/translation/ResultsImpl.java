
package com.google.code.bing.search.schema.adapter.json.translation;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.translation.Results;
import com.google.code.bing.search.schema.translation.TranslationResult;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONArray>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<TranslationResult> translationResultList;

    public List<TranslationResult> getTranslationResultList() {
        if (translationResultList == null) {
            translationResultList = new ArrayList<TranslationResult>();
        }
        return this.translationResultList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (TranslationResult o : getTranslationResultList()) {
			adapter.add(((TranslationResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			TranslationResultImpl result = new TranslationResultImpl();
			result.adaptFrom((JSONObject) o);
			getTranslationResultList().add(result);
		}
	}
}
