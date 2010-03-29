
package com.google.code.bing.search.schema.adapter.jaxb.relatedsearch;

import java.io.Serializable;

import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResponse;
import com.google.code.bing.search.schema.relatedsearch.Results;
public class RelatedSearchImpl
    implements Serializable, RelatedSearchResponse
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