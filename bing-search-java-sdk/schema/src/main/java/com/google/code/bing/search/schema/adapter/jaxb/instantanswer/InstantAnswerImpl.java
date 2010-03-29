
package com.google.code.bing.search.schema.adapter.jaxb.instantanswer;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResponse;
import com.google.code.bing.search.schema.instantanswer.Results;
import com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswer;
public class InstantAnswerImpl
    implements Serializable, InstantAnswerResponse, Adaptable<InstantAnswerResponse, InstantAnswer>
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
	public InstantAnswer toAdaptee(InstantAnswerResponse adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InstantAnswerResponse toAdapter(InstantAnswer adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
