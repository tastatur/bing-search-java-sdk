
package com.google.code.bing.search.schema.adapter.jaxb.instantanswer;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResponse;
import com.google.code.bing.search.schema.instantanswer.Results;
import com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswer;
public class InstantAnswerImpl
    extends BaseAdapter implements InstantAnswerResponse, Adaptable<InstantAnswerResponse, InstantAnswer>
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
	public InstantAnswer adaptTo() {
		InstantAnswer adapter = new InstantAnswer();
		copyProperties(adapter  , this);
		return adapter;
	}

	@Override
	public void adaptFrom(InstantAnswer adaptee) {
		copyProperties(this, adaptee);
	}
}
