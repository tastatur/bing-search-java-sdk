
package com.google.code.bing.search.schema.adapter.soap.news;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsResult;
import com.google.code.bing.search.schema.news.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.news.Results>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.news.Results adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.news.Results adapter = new com.microsoft.schemas.livesearch._2008._04.xml.news.Results();
		copyProperties(adapter, this);
		for (NewsResult o : getNewsResultList()) {
			adapter.getNewsResultList().add(((NewsResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.news.Results adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.news.NewsResult o : adaptee.getNewsResultList()) {
			NewsResultImpl result = new NewsResultImpl();
			result.adaptFrom(o);
			getNewsResultList().add(result);
		}
	}
}
