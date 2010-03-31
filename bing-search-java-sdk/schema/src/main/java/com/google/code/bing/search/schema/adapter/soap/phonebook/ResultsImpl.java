
package com.google.code.bing.search.schema.adapter.soap.phonebook;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.phonebook.PhonebookResult;
import com.google.code.bing.search.schema.phonebook.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._03.search.ArrayOfPhonebookResult>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<PhonebookResult> phonebookResultList;

    public List<PhonebookResult> getPhonebookResultList() {
        if (phonebookResultList == null) {
            phonebookResultList = new ArrayList<PhonebookResult>();
        }
        return this.phonebookResultList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.ArrayOfPhonebookResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ArrayOfPhonebookResult adapter = new com.microsoft.schemas.livesearch._2008._03.search.ArrayOfPhonebookResult();
		copyProperties(adapter, this);
		for (PhonebookResult o : getPhonebookResultList()) {
			adapter.getPhonebookResult().add(((PhonebookResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.ArrayOfPhonebookResult adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._03.search.PhonebookResult o : adaptee.getPhonebookResult()) {
			PhonebookResultImpl result = new PhonebookResultImpl();
			result.adaptFrom(o);
			getPhonebookResultList().add(result);
		}
	}
}
