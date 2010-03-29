
package com.google.code.bing.search.schema.adapter.jaxb.phonebook;

import java.io.Serializable;

import com.google.code.bing.search.schema.phonebook.PhonebookResponse;
import com.google.code.bing.search.schema.phonebook.Results;
public class PhonebookImpl
    implements Serializable, PhonebookResponse
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long offset;
    protected String localSerpUrl;
    protected String title;
    protected ResultsImpl results;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long value) {
        this.offset = value;
    }

    public String getLocalSerpUrl() {
        return localSerpUrl;
    }

    public void setLocalSerpUrl(String value) {
        this.localSerpUrl = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

}
