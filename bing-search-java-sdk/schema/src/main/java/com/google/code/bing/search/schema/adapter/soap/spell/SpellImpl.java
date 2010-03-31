
package com.google.code.bing.search.schema.adapter.soap.spell;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.spell.Results;
import com.google.code.bing.search.schema.spell.SpellResponse;
public class SpellImpl
    extends BaseAdapter implements SpellResponse, Adaptable<SpellResponse, com.microsoft.schemas.livesearch._2008._03.search.SpellResponse>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected ResultsImpl results;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long value) {
        this.total = value;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.SpellResponse adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.SpellResponse adapter = new com.microsoft.schemas.livesearch._2008._03.search.SpellResponse();
		copyProperties(adapter, this);
		if (getResults() != null) {
			adapter.setResults(((ResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(com.microsoft.schemas.livesearch._2008._03.search.SpellResponse adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			ResultsImpl results = new ResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
	}
}
