
package com.google.code.bing.search.schema.adapter.json.phonebook;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.phonebook.PhonebookResponse;
import com.google.code.bing.search.schema.phonebook.Results;
import com.microsoft.schemas.livesearch._2008._04.xml.phonebook.Phonebook;
public class PhonebookImpl
    extends BaseAdapter implements PhonebookResponse, Adaptable<PhonebookResponse, Phonebook>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected Long total;
    protected Long offset;
    protected String localSerpUrl;
    protected String title;
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

    public String getLocalSerpUrl() {
        return localSerpUrl;
    }

    public void setLocalSerpUrl(String value) {
        this.localSerpUrl = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results value) {
        this.results = ((ResultsImpl) value);
    }

	@Override
	public Phonebook adaptTo() {
		Phonebook adapter = new Phonebook();
		copyProperties(adapter, this);
		if (getResults() != null) {
			adapter.setResults(((ResultsImpl) getResults()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(Phonebook adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getResults() != null) {
			ResultsImpl results = new ResultsImpl();
			results.adaptFrom(adaptee.getResults());
			setResults(results);
		}
	}
}
