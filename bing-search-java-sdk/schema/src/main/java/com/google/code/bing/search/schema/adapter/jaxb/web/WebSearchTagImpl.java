
package com.google.code.bing.search.schema.adapter.jaxb.web;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.web.WebSearchTag;
public class WebSearchTagImpl
    implements Serializable, WebSearchTag, Adaptable<WebSearchTag, com.microsoft.schemas.livesearch._2008._04.xml.web.WebSearchTag>
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

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.web.WebSearchTag toAdaptee(
			WebSearchTag adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebSearchTag toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.web.WebSearchTag adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
