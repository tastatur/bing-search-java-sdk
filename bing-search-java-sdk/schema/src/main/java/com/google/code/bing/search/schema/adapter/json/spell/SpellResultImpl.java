
package com.google.code.bing.search.schema.adapter.json.spell;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.spell.SpellResult;
public class SpellResultImpl
    extends BaseAdapter implements SpellResult, Adaptable<SpellResult, com.microsoft.schemas.livesearch._2008._04.xml.spell.SpellResult>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.spell.SpellResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.spell.SpellResult adapter = new com.microsoft.schemas.livesearch._2008._04.xml.spell.SpellResult();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.spell.SpellResult adaptee) {
		copyProperties(this, adaptee);
	}
}
