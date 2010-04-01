
package com.google.code.bing.search.schema.adapter.json.phonebook;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.phonebook.PhonebookResult;
import com.google.code.bing.search.schema.phonebook.Results;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<PhonebookResult> phonebookResultList;

    public List<PhonebookResult> getPhonebookResultList() {
        if (phonebookResultList == null) {
            phonebookResultList = new ArrayList<PhonebookResult>();
        }
        return this.phonebookResultList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		for (PhonebookResult o : getPhonebookResultList()) {
			(getJSONArray(adapter, "PhonebookResult")).add(((PhonebookResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (Object o : getJSONArray(adaptee, "PhonebookResult")) {
			PhonebookResultImpl result = new PhonebookResultImpl();
			result.adaptFrom((JSONObject) o);
			getPhonebookResultList().add(result);
		}
	}
}
