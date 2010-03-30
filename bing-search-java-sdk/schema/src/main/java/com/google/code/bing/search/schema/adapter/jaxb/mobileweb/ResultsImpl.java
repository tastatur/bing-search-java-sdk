
package com.google.code.bing.search.schema.adapter.jaxb.mobileweb;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.mobileweb.MobileWebResult;
import com.google.code.bing.search.schema.mobileweb.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.Results>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.Results adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.Results adapter = new com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.Results();
		copyProperties(adapter  , this);
		for (MobileWebResult o : getMobileWebResultList()) {
			adapter.getMobileWebResultList().add(((MobileWebResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.Results adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.mobileweb.MobileWebResult o : adaptee.getMobileWebResultList()) {
			MobileWebResultImpl result = new MobileWebResultImpl();
			result.adaptFrom(o);
			getMobileWebResultList().add(result);
		}
	}
}
