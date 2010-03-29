
package com.google.code.bing.search.schema.adapter.jaxb;

import java.io.Serializable;

import com.google.code.bing.search.schema.Query;
public class QueryImpl
    implements Serializable, Query
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

}
