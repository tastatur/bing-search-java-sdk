
package com.google.code.bing.search.schema.adapter.soap.mobileweb;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.mobileweb.MobileWebResponse;
import com.google.code.bing.search.schema.mobileweb.Results;
public class MobileWebImpl
    extends BaseAdapter implements MobileWebResponse, Adaptable<MobileWebResponse, com.microsoft.schemas.livesearch._2008._03.search.MobileWebResponse>
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
	public com.microsoft.schemas.livesearch._2008._03.search.MobileWebResponse adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.MobileWebResponse adapter = new com.microsoft.schemas.livesearch._2008._03.search.MobileWebResponse();
		copyProperties(adapter  , this);
		if (getResults() != null) {
			adapter.setResults(((ResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(com.microsoft.schemas.livesearch._2008._03.search.MobileWebResponse adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			ResultsImpl results = new ResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
	}
}
