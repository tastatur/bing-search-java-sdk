
package com.google.code.bing.search.schema.adapter.jaxb.spell;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.spell.Results;
import com.google.code.bing.search.schema.spell.SpellResponse;
import com.microsoft.schemas.livesearch._2008._04.xml.spell.Spell;
public class SpellImpl
    implements Serializable, SpellResponse, Adaptable<SpellResponse, Spell>
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
	public Spell toAdaptee(SpellResponse adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpellResponse toAdapter(Spell adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
