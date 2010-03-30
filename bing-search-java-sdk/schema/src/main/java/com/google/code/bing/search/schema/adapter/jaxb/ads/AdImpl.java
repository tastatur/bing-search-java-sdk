
package com.google.code.bing.search.schema.adapter.jaxb.ads;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.ads.AdResponse;
import com.google.code.bing.search.schema.ads.Results;
import com.microsoft.schemas.livesearch._2008._04.xml.ads.Ad;

public class AdImpl
    extends BaseAdapter implements AdResponse, Adaptable<AdResponse, Ad>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long pageNumber;
    protected Double adApiVersion;
    protected ResultsImpl results;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

    public Long getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Long value) {
        this.pageNumber = value;
    }

    public Double getAdApiVersion() {
        return adApiVersion;
    }

    public void setAdApiVersion(Double value) {
        this.adApiVersion = value;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

	@Override
	public Ad adaptTo() {
		Ad adapter = new Ad();
		copyProperties(adapter , this);
		if (getResults() != null) {
			adapter.setResults(((ResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(Ad adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			ResultsImpl results = new ResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
	}
}
