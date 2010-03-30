
package com.google.code.bing.search.schema.adapter.soap.web;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.Results;
import com.google.code.bing.search.schema.web.WebResult;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.web.Results>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.web.Results adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.web.Results adapter = new com.microsoft.schemas.livesearch._2008._04.xml.web.Results();
		copyProperties(adapter, this);
		for (WebResult o : getWebResultList()) {
			adapter.getWebResultList().add(((WebResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.web.Results adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.web.WebResult o : adaptee.getWebResultList()) {
			WebResultImpl result = new WebResultImpl();
			result.adaptFrom(o);
			getWebResultList().add(result);
		}
	}
}
