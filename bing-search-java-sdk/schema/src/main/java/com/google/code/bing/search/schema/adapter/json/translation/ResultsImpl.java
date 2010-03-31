
package com.google.code.bing.search.schema.adapter.json.translation;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.translation.Results;
import com.google.code.bing.search.schema.translation.TranslationResult;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<TranslationResult> translationResultList;

    public List<TranslationResult> getTranslationResultList() {
        if (translationResultList == null) {
            translationResultList = new ArrayList<TranslationResult>();
        }
        return this.translationResultList;
    }

	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		for (TranslationResult o : getTranslationResultList()) {
			adapter.getTranslationResultList().add(((TranslationResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.translation.TranslationResult o : adaptee.getTranslationResultList()) {
			TranslationResultImpl result = new TranslationResultImpl();
			result.adaptFrom(o);
			getTranslationResultList().add(result);
		}
	}
}
