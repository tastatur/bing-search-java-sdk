
package com.google.code.bing.search.schema.adapter.jaxb.ads;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.ads.AdResponse;
import com.google.code.bing.search.schema.ads.Results;
import com.microsoft.schemas.livesearch._2008._04.xml.ads.Ad;

public class AdImpl
    implements Serializable, AdResponse, Adaptable<AdResponse, Ad>
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
	public Ad toAdaptee(AdResponse adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdResponse toAdapter(Ad adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
