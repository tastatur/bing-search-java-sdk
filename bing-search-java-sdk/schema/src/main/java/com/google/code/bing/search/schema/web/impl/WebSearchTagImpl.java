
package com.google.code.bing.search.schema.web.impl;

import java.io.Serializable;

import com.google.code.bing.search.schema.web.WebSearchTag;
public class WebSearchTagImpl
    implements Serializable, WebSearchTag
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String name;
    protected String value;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
