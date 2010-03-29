
package com.google.code.bing.search.schema.adapter.jaxb;

import java.io.Serializable;

import com.google.code.bing.search.schema.Query;
import com.google.code.bing.search.schema.adapter.Adaptable;
public class QueryImpl
    implements Serializable, Query, Adaptable<Query, com.microsoft.schemas.livesearch._2008._04.xml.element.Query>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String searchTerms;
    protected String alteredQuery;
    protected String alterationOverrideQuery;

    public String getSearchTerms() {
        return searchTerms;
    }

    public void setSearchTerms(String value) {
        this.searchTerms = value;
    }

    public String getAlteredQuery() {
        return alteredQuery;
    }

    public void setAlteredQuery(String value) {
        this.alteredQuery = value;
    }

    public String getAlterationOverrideQuery() {
        return alterationOverrideQuery;
    }

    public void setAlterationOverrideQuery(String value) {
        this.alterationOverrideQuery = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.element.Query toAdaptee(
			Query adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.element.Query adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
