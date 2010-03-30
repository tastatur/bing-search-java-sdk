
package com.google.code.bing.search.schema.adapter.json.translation;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.translation.TranslationResult;
public class TranslationResultImpl
    extends BaseAdapter implements TranslationResult, Adaptable<TranslationResult, com.microsoft.schemas.livesearch._2008._04.xml.translation.TranslationResult>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.translation.TranslationResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.translation.TranslationResult adapter = new com.microsoft.schemas.livesearch._2008._04.xml.translation.TranslationResult();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.translation.TranslationResult adaptee) {
		copyProperties(this, adaptee);
	}
}
