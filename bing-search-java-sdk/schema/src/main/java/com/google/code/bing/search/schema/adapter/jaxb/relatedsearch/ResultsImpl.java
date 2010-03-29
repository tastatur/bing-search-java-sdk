
package com.google.code.bing.search.schema.adapter.jaxb.relatedsearch;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResult;
import com.google.code.bing.search.schema.relatedsearch.Results;
public class ResultsImpl
    implements Serializable, Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.Results>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<RelatedSearchResult> relatedSearchResultList;

    public List<RelatedSearchResult> getRelatedSearchResultList() {
        if (relatedSearchResultList == null) {
            relatedSearchResultList = new ArrayList<RelatedSearchResult>();
        }
        return this.relatedSearchResultList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.Results toAdaptee(
			Results adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Results toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.Results adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
