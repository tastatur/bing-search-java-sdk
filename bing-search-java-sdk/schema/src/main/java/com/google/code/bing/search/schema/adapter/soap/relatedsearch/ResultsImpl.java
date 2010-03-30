
package com.google.code.bing.search.schema.adapter.soap.relatedsearch;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.relatedsearch.RelatedSearchResult;
import com.google.code.bing.search.schema.relatedsearch.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.Results>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.Results adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.Results adapter = new com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.Results();
		copyProperties(adapter, this);
		for (RelatedSearchResult o : getRelatedSearchResultList()) {
			adapter.getRelatedSearchResultList().add(((RelatedSearchResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.Results adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.relatedsearch.RelatedSearchResult o : adaptee.getRelatedSearchResultList()) {
			RelatedSearchResultImpl result = new RelatedSearchResultImpl();
			result.adaptFrom(o);
			getRelatedSearchResultList().add(result);
		}
	}
}
