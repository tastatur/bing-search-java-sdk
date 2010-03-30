
package com.google.code.bing.search.schema.adapter.jaxb.web;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.DeepLink;
import com.google.code.bing.search.schema.web.DeepLinks;
public class DeepLinksImpl
    extends BaseAdapter implements DeepLinks, Adaptable<DeepLinks, com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLinks>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLinks adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLinks adapter = new com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLinks();
		copyProperties(adapter, this);
		for (DeepLink deepLink : getDeepLinkList()) {
			adapter.getDeepLinkList().add(((DeepLinkImpl) deepLink).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLinks adaptee) {
		copyProperties(this, adaptee);
		for (com.microsoft.schemas.livesearch._2008._04.xml.web.DeepLink o : adaptee.getDeepLinkList()) {
			DeepLinkImpl deepLink = new DeepLinkImpl();
			deepLink.adaptFrom(o);
			getDeepLinkList().add(deepLink);
		}
	}
}
