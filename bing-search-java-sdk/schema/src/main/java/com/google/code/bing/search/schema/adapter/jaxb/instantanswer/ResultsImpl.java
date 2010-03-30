
package com.google.code.bing.search.schema.adapter.jaxb.instantanswer;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerResult;
import com.google.code.bing.search.schema.instantanswer.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.Results>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<InstantAnswerResult> instantAnswerResultList;

    public List<InstantAnswerResult> getInstantAnswerResultList() {
        if (instantAnswerResultList == null) {
            instantAnswerResultList = new ArrayList<InstantAnswerResult>();
        }
        return this.instantAnswerResultList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.Results adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.Results adapter = new com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.Results();
		copyProperties(adapter , this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.Results adaptee) {
		copyProperties(this, adaptee);
	}
}
