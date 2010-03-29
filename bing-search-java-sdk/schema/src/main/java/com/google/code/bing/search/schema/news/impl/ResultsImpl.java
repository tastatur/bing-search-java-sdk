
package com.google.code.bing.search.schema.news.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.news.NewsResult;
import com.google.code.bing.search.schema.news.Results;
public class ResultsImpl
    implements Serializable, Results
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsResult> newsResultList;

    public List<NewsResult> getNewsResultList() {
        if (newsResultList == null) {
            newsResultList = new ArrayList<NewsResult>();
        }
        return this.newsResultList;
    }

}
