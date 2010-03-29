
package com.google.code.bing.search.schema.adapter.jaxb.translation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.translation.Results;
import com.google.code.bing.search.schema.translation.TranslationResult;
public class ResultsImpl
    implements Serializable, Results
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<TranslationResult> translationResultList;

    public List<TranslationResult> getTranslationResultList() {
        if (translationResultList == null) {
            translationResultList = new ArrayList<TranslationResult>();
        }
        return this.translationResultList;
    }

}
