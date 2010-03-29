
package com.google.code.bing.search.schema.spell.impl;

import java.io.Serializable;

import com.google.code.bing.search.schema.spell.SpellResult;
public class SpellResultImpl
    implements Serializable, SpellResult
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
