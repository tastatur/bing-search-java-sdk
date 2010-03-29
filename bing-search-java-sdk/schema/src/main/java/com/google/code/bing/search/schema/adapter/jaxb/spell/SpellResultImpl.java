
package com.google.code.bing.search.schema.adapter.jaxb.spell;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.spell.SpellResult;
public class SpellResultImpl
    implements Serializable, SpellResult, Adaptable<SpellResult, com.microsoft.schemas.livesearch._2008._04.xml.spell.SpellResult>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.spell.SpellResult toAdaptee(
			SpellResult adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpellResult toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.spell.SpellResult adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
