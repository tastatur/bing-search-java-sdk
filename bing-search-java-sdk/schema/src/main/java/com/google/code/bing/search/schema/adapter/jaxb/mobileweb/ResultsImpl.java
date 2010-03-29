
package com.google.code.bing.search.schema.adapter.jaxb.mobileweb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.mobileweb.MobileWebResult;
import com.google.code.bing.search.schema.mobileweb.Results;
public class ResultsImpl
    implements Serializable, Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.Results>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<MobileWebResult> mobileWebResultList;

    public List<MobileWebResult> getMobileWebResultList() {
        if (mobileWebResultList == null) {
            mobileWebResultList = new ArrayList<MobileWebResult>();
        }
        return this.mobileWebResultList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.Results toAdaptee(
			Results adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Results toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.Results adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
