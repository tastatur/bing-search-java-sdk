
package com.google.code.bing.search.schema.adapter.soap.web;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.Results;
import com.google.code.bing.search.schema.web.WebResponse;
public class WebImpl
    extends BaseAdapter implements WebResponse, Adaptable<WebResponse, com.microsoft.schemas.livesearch._2008._03.search.WebResponse>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long offset;
    protected ResultsImpl results;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long value) {
        this.offset = value;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.WebResponse adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.WebResponse adapter = new com.microsoft.schemas.livesearch._2008._03.search.WebResponse();
		copyProperties(adapter, this);
		if (getResults() != null) {
			adapter.setResults(((ResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(com.microsoft.schemas.livesearch._2008._03.search.WebResponse adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			ResultsImpl results = new ResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
	}
}
