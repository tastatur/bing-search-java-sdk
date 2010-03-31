
package com.google.code.bing.search.schema.adapter.soap.translation;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.translation.Results;
import com.google.code.bing.search.schema.translation.TranslationResult;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._03.search.ArrayOfTranslationResult>
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
	public com.microsoft.schemas.livesearch._2008._03.search.ArrayOfTranslationResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ArrayOfTranslationResult adapter = new com.microsoft.schemas.livesearch._2008._03.search.ArrayOfTranslationResult();
		copyProperties(adapter, this);
		for (TranslationResult o : getTranslationResultList()) {
			adapter.getTranslationResult().add(((TranslationResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.ArrayOfTranslationResult adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._03.search.TranslationResult o : adaptee.getTranslationResult()) {
			TranslationResultImpl result = new TranslationResultImpl();
			result.adaptFrom(o);
			getTranslationResultList().add(result);
		}
	}
}
