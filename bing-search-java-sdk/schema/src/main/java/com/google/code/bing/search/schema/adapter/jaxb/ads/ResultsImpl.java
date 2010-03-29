
package com.google.code.bing.search.schema.adapter.jaxb.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.ads.AdResult;
import com.google.code.bing.search.schema.ads.Results;

public class ResultsImpl
    implements Serializable, Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.ads.Results>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.ads.Results toAdaptee(
			Results adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Results toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.ads.Results adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
