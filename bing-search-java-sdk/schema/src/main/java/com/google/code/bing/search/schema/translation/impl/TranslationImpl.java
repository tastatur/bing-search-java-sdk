
package com.google.code.bing.search.schema.translation.impl;

import java.io.Serializable;

import com.google.code.bing.search.schema.translation.Results;
import com.google.code.bing.search.schema.translation.TranslationResponse;
public class TranslationImpl
    implements Serializable, TranslationResponse
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected ResultsImpl results;

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

}
