
package com.google.code.bing.search.schema.adapter.soap.relatedsearch;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResponse;
import com.google.code.bing.search.schema.relatedsearch.Results;
public class RelatedSearchImpl
    extends BaseAdapter implements RelatedSearchResponse, Adaptable<RelatedSearchResponse, com.microsoft.schemas.livesearch._2008._03.search.RelatedSearchResponse>
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
	public com.microsoft.schemas.livesearch._2008._03.search.RelatedSearchResponse adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.RelatedSearchResponse adapter = new com.microsoft.schemas.livesearch._2008._03.search.RelatedSearchResponse();
		copyProperties(adapter, this);
		if (getResults() != null) {
			adapter.setResults(((ResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(com.microsoft.schemas.livesearch._2008._03.search.RelatedSearchResponse adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			ResultsImpl results = new ResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
	}
}
