
package com.google.code.bing.search.schema.adapter.jaxb.ads;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.ads.AdResult;
import com.google.code.bing.search.schema.ads.Results;

public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.ads.Results>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<AdResult> adResultList;

    public List<AdResult> getAdResultList() {
        if (adResultList == null) {
            adResultList = new ArrayList<AdResult>();
        }
        return this.adResultList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.ads.Results adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.ads.Results adapter = new com.microsoft.schemas.livesearch._2008._04.xml.ads.Results();
		copyProperties(adapter   , this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.ads.Results adaptee) {
		copyProperties(this, adaptee);
	}
}
