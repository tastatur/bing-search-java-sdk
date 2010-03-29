
package com.google.code.bing.search.schema.adapter.jaxb.translation;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.translation.Results;
import com.google.code.bing.search.schema.translation.TranslationResponse;
import com.microsoft.schemas.livesearch._2008._04.xml.translation.Translation;
public class TranslationImpl
    implements Serializable, TranslationResponse, Adaptable<TranslationResponse, Translation>
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
	public Translation toAdaptee(TranslationResponse adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TranslationResponse toAdapter(Translation adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
