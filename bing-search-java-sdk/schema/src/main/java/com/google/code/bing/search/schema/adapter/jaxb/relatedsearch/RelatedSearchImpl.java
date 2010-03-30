
package com.google.code.bing.search.schema.adapter.jaxb.relatedsearch;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResponse;
import com.google.code.bing.search.schema.relatedsearch.Results;
import com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.RelatedSearch;
public class RelatedSearchImpl
    extends BaseAdapter implements RelatedSearchResponse, Adaptable<RelatedSearchResponse, RelatedSearch>
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
	public RelatedSearch adaptTo() {
		RelatedSearch adapter = new RelatedSearch();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(RelatedSearch adaptee) {
		copyProperties(this, adaptee);
	}
}
