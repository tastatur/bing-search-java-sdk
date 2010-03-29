
package com.google.code.bing.search.schema.adapter.jaxb.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.web.Results;
import com.google.code.bing.search.schema.web.WebResult;
public class ResultsImpl
    implements Serializable, Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.web.Results>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.web.Results toAdaptee(
			Results adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Results toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.web.Results adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
