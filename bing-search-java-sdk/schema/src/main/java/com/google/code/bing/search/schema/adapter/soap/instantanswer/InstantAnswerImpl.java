
package com.google.code.bing.search.schema.adapter.soap.instantanswer;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResponse;
import com.google.code.bing.search.schema.instantanswer.Results;
public class InstantAnswerImpl
    extends BaseAdapter implements InstantAnswerResponse, Adaptable<InstantAnswerResponse, com.microsoft.schemas.livesearch._2008._03.search.InstantAnswerResponse>
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
	public com.microsoft.schemas.livesearch._2008._03.search.InstantAnswerResponse adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.InstantAnswerResponse adapter = new com.microsoft.schemas.livesearch._2008._03.search.InstantAnswerResponse();
		copyProperties(adapter  , this);
		if (getResults() != null) {
			adapter.setResults(((ResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(com.microsoft.schemas.livesearch._2008._03.search.InstantAnswerResponse adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			ResultsImpl results = new ResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
	}
}
