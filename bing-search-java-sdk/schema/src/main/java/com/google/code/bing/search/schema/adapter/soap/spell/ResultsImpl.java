
package com.google.code.bing.search.schema.adapter.soap.spell;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.spell.Results;
import com.google.code.bing.search.schema.spell.SpellResult;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._03.search.ArrayOfSpellResult>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<SpellResult> spellResultList;

    public List<SpellResult> getSpellResultList() {
        if (spellResultList == null) {
            spellResultList = new ArrayList<SpellResult>();
        }
        return this.spellResultList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.ArrayOfSpellResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ArrayOfSpellResult adapter = new com.microsoft.schemas.livesearch._2008._03.search.ArrayOfSpellResult();
		copyProperties(adapter, this);
		for (SpellResult o : getSpellResultList()) {
			adapter.getSpellResult().add(((SpellResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.ArrayOfSpellResult adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._03.search.SpellResult o : adaptee.getSpellResult()) {
			SpellResultImpl result = new SpellResultImpl();
			result.adaptFrom(o);
			getSpellResultList().add(result);
		}
	}
}
