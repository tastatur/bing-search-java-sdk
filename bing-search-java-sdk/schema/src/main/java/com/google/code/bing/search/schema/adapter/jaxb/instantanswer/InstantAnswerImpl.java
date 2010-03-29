
package com.google.code.bing.search.schema.adapter.jaxb.instantanswer;

import java.io.Serializable;

import com.google.code.bing.search.schema.instantanswer.InstantAnswerResponse;
import com.google.code.bing.search.schema.instantanswer.Results;
public class InstantAnswerImpl
    implements Serializable, InstantAnswerResponse
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
