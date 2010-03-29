
package com.google.code.bing.search.schema.adapter.jaxb.phonebook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.phonebook.PhonebookResult;
import com.google.code.bing.search.schema.phonebook.Results;
public class ResultsImpl
    implements Serializable, Results
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<PhonebookResult> phonebookResultList;

    public List<PhonebookResult> getPhonebookResultList() {
        if (phonebookResultList == null) {
            phonebookResultList = new ArrayList<PhonebookResult>();
        }
        return this.phonebookResultList;
    }

}
