
package com.google.code.bing.search.schema.adapter.jaxb.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.web.DeepLink;
import com.google.code.bing.search.schema.web.DeepLinks;
public class DeepLinksImpl
    implements Serializable, DeepLinks, Adaptable<DeepLinks, com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLinks>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<DeepLink> deepLinkList;

    public List<DeepLink> getDeepLinkList() {
        if (deepLinkList == null) {
            deepLinkList = new ArrayList<DeepLink>();
        }
        return this.deepLinkList;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLinks toAdaptee(
			DeepLinks adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeepLinks toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLinks adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
