
package com.google.code.bing.search.schema.adapter.jaxb.instantanswer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.instantanswer.InstantAnswerResult;
import com.google.code.bing.search.schema.instantanswer.Results;
public class ResultsImpl
    implements Serializable, Results
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<InstantAnswerResult> instantAnswerResultList;

    public List<InstantAnswerResult> getInstantAnswerResultList() {
        if (instantAnswerResultList == null) {
            instantAnswerResultList = new ArrayList<InstantAnswerResult>();
        }
        return this.instantAnswerResultList;
    }

}
