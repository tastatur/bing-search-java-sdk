
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;

import com.google.code.bing.search.schema.news.NewsResponse;
import com.google.code.bing.search.schema.news.RelatedSearches;
import com.google.code.bing.search.schema.news.Results;
public class NewsImpl
    implements Serializable, NewsResponse
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long offset;
    protected RelatedSearchesImpl relatedSearches;
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

    public RelatedSearches getRelatedSearches() {
        return relatedSearches;
    }

    public void setRelatedSearches(RelatedSearches value) {
        this.relatedSearches = ((RelatedSearchesImpl) value);
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

}
