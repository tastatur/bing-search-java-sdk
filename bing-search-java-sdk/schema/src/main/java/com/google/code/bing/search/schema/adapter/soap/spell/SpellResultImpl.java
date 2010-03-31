
package com.google.code.bing.search.schema.adapter.soap.spell;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.spell.SpellResult;
public class SpellResultImpl
    extends BaseAdapter implements SpellResult, Adaptable<SpellResult, com.microsoft.schemas.livesearch._2008._03.search.SpellResult>
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
	public com.microsoft.schemas.livesearch._2008._03.search.SpellResult adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.SpellResult adapter = new com.microsoft.schemas.livesearch._2008._03.search.SpellResult();
		copyProperties(adapter, this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.SpellResult adaptee) {
		copyProperties(this, adaptee);
	}
}
