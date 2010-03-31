
package com.google.code.bing.search.schema.adapter.soap.web;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.Results;
import com.google.code.bing.search.schema.web.WebResult;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebResult>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<WebResult> webResultList;

    public List<WebResult> getWebResultList() {
        if (webResultList == null) {
            webResultList = new ArrayList<WebResult>();
        }
        return this.webResultList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebResult adapter = new com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebResult();
		copyProperties(adapter, this);
		for (WebResult o : getWebResultList()) {
			adapter.getWebResult().add(((WebResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebResult adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._03.search.WebResult o : adaptee.getWebResult()) {
			WebResultImpl result = new WebResultImpl();
			result.adaptFrom(o);
			getWebResultList().add(result);
		}
	}
}
