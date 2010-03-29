
package com.google.code.bing.search.schema.adapter.jaxb.spell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.spell.Results;
import com.google.code.bing.search.schema.spell.SpellResult;
public class ResultsImpl
    implements Serializable, Results, Adaptable<Results, com.microsoft.schemas.livesearch._2008._04.xml.spell.Results>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.spell.Results toAdaptee(
			Results adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Results toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.spell.Results adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
