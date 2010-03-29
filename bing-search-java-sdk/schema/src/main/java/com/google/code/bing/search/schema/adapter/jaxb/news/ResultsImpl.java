
package com.google.code.bing.search.schema.adapter.jaxb.news;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.news.NewsResult;
import com.google.code.bing.search.schema.news.Results;
public class ResultsImpl
    implements Serializable, Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.news.Results>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<NewsResult> newsResultList;

    public List<NewsResult> getNewsResultList() {
        if (newsResultList == null) {
            newsResultList = new ArrayList<NewsResult>();
        }
        return this.newsResultList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.news.Results toAdaptee(
			Results adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Results toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.news.Results adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
