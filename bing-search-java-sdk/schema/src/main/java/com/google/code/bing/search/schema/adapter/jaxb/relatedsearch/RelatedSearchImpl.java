
package com.google.code.bing.search.schema.adapter.jaxb.relatedsearch;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResponse;
import com.google.code.bing.search.schema.relatedsearch.Results;
import com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.RelatedSearch;
public class RelatedSearchImpl
    implements Serializable, RelatedSearchResponse, Adaptable<RelatedSearchResponse, RelatedSearch>
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
	public RelatedSearch toAdaptee(RelatedSearchResponse adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RelatedSearchResponse toAdapter(RelatedSearch adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
