
package com.google.code.bing.search.schema.adapter.jaxb.translation;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.translation.TranslationResult;
public class TranslationResultImpl
    implements Serializable, TranslationResult, Adaptable<TranslationResult, com.microsoft.schemas.livesearch._2008._04.xml.translation.TranslationResult>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.translation.TranslationResult toAdaptee(
			TranslationResult adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TranslationResult toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.translation.TranslationResult adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
