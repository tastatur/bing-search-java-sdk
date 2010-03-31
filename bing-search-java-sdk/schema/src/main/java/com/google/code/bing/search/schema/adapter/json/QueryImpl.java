
package com.google.code.bing.search.schema.adapter.json;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.Query;
import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
public class QueryImpl
    extends BaseAdapter implements Query, Adaptable<Query, JSONObject>
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
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
	}
}
