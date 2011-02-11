/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.google.code.bing.search.schema;



/**
 * The Class Query.
 */
public class Query
    extends SchemaEntity
{
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 2461660169443089969L;
    
    /** The search terms. */
    protected String searchTerms;
    
    /** The altered query. */
    protected String alteredQuery;
    
    /** The alteration override query. */
    protected String alterationOverrideQuery;

    /**
     * Gets the search terms.
     * 
     * @return the search terms
     */
    public String getSearchTerms() {
        return searchTerms;
    }

    /**
     * Sets the search terms.
     * 
     * @param value the new search terms
     */
    public void setSearchTerms(String value) {
        this.searchTerms = value;
    }

    /**
     * Gets the altered query.
     * 
     * @return the altered query
     */
    public String getAlteredQuery() {
        return alteredQuery;
    }

    /**
     * Sets the altered query.
     * 
     * @param value the new altered query
     */
    public void setAlteredQuery(String value) {
        this.alteredQuery = value;
    }

    /**
     * Gets the alteration override query.
     * 
     * @return the alteration override query
     */
    public String getAlterationOverrideQuery() {
        return alterationOverrideQuery;
    }

    /**
     * Sets the alteration override query.
     * 
     * @param value the new alteration override query
     */
    public void setAlterationOverrideQuery(String value) {
        this.alterationOverrideQuery = value;
    }
}
