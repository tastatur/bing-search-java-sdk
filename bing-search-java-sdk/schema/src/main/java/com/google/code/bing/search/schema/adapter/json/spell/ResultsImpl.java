
package com.google.code.bing.search.schema.adapter.json.spell;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.spell.Results;
import com.google.code.bing.search.schema.spell.SpellResult;
public class ResultsImpl
    extends BaseAdapter implements Results, Adaptable<Results, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<SpellResult> spellResultList;

    public List<SpellResult> getSpellResultList() {
        if (spellResultList == null) {
            spellResultList = new ArrayList<SpellResult>();
        }
        return this.spellResultList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		for (SpellResult o : getSpellResultList()) {
			(getJSONArray(adapter, "SpellResult")).add(((SpellResultImpl) o).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (Object o : getJSONArray(adaptee, "SpellResultList")) {
			SpellResultImpl result = new SpellResultImpl();
			result.adaptFrom((JSONObject) o);
			getSpellResultList().add(result);
		}
	}
}
