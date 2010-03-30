
package com.google.code.bing.search.schema.adapter.jaxb.translation;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.translation.Results;
import com.google.code.bing.search.schema.translation.TranslationResponse;
import com.microsoft.schemas.livesearch._2008._04.xml.translation.Translation;
public class TranslationImpl
    extends BaseAdapter implements TranslationResponse, Adaptable<TranslationResponse, Translation>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected ResultsImpl results;

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

	@Override
	public Translation adaptTo() {
		Translation adapter = new Translation();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(Translation adaptee) {
		copyProperties(this, adaptee);
	}
}
