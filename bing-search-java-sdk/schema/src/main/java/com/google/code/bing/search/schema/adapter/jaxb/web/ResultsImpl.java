
package com.google.code.bing.search.schema.adapter.jaxb.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.web.Results;
import com.google.code.bing.search.schema.web.WebResult;
public class ResultsImpl
    implements Serializable, Results
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<WebResult> webResultList;

    public List<WebResult> getWebResultList() {
        if (webResultList == null) {
            webResultList = new ArrayList<WebResult>();
        }
        return this.webResultList;
    }

}
