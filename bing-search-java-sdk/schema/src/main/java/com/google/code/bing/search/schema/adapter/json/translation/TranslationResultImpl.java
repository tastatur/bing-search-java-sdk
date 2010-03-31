
package com.google.code.bing.search.schema.adapter.json.translation;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.translation.TranslationResult;
public class TranslationResultImpl
    extends BaseAdapter implements TranslationResult, Adaptable<TranslationResult, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String translatedTerm;

    public String getTranslatedTerm() {
        return translatedTerm;
    }

    public void setTranslatedTerm(String value) {
        this.translatedTerm = value;
    }

	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
	}
}
