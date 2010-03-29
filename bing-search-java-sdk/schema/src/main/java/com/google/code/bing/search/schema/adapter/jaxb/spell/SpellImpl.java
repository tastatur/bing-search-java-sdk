
package com.google.code.bing.search.schema.adapter.jaxb.spell;

import java.io.Serializable;

import com.google.code.bing.search.schema.spell.Results;
import com.google.code.bing.search.schema.spell.SpellResponse;
public class SpellImpl
    implements Serializable, SpellResponse
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

}
