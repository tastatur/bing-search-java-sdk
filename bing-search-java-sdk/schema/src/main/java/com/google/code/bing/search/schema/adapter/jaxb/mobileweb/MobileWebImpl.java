
package com.google.code.bing.search.schema.adapter.jaxb.mobileweb;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.mobileweb.MobileWebResponse;
import com.google.code.bing.search.schema.mobileweb.Results;
import com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.MobileWeb;
public class MobileWebImpl
    implements Serializable, MobileWebResponse, Adaptable<MobileWebResponse, MobileWeb>
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
	public MobileWeb toAdaptee(MobileWebResponse adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MobileWebResponse toAdapter(MobileWeb adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
