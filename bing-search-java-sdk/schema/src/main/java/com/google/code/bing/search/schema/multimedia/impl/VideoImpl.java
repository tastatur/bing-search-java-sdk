
package com.google.code.bing.search.schema.multimedia.impl;

import java.io.Serializable;

import com.google.code.bing.search.schema.multimedia.Results;
import com.google.code.bing.search.schema.multimedia.VideoResponse;
public class VideoImpl
    implements Serializable, VideoResponse
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long offset;
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

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

}
