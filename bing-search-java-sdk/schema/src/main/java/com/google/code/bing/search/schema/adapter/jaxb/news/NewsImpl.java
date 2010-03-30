
package com.google.code.bing.search.schema.adapter.jaxb.news;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.news.NewsResponse;
import com.google.code.bing.search.schema.news.RelatedSearches;
import com.google.code.bing.search.schema.news.Results;
import com.microsoft.schemas.livesearch._2008._04.xml.news.News;
public class NewsImpl
    extends BaseAdapter implements NewsResponse, Adaptable<NewsResponse, News>
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

	@Override
	public News adaptTo() {
		News adapter = new News();
		copyProperties(adapter, this);
		if (getResults() != null) {
			adapter.setResults(((ResultsImpl) getResults()).adaptTo());
		}
		if (getRelatedSearches() != null) {
			adapter.setRelatedSearches(((RelatedSearchesImpl) getRelatedSearches()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(News adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			ResultsImpl results = new ResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
		if (adaptee.getRelatedSearches() != null) {
			RelatedSearchesImpl results = new RelatedSearchesImpl();
			results.adaptFrom(adaptee.getRelatedSearches());
			setRelatedSearches(results);
		}
	}
}
