
package com.google.code.bing.search.schema.adapter.soap.ads;

import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.ads.AdResponse;
import com.google.code.bing.search.schema.ads.Results;

public class AdImpl
    extends BaseAdapter implements AdResponse
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
}
