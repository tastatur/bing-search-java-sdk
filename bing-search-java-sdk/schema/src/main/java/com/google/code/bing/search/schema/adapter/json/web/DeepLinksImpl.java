
package com.google.code.bing.search.schema.adapter.json.web;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.DeepLink;
import com.google.code.bing.search.schema.web.DeepLinks;
public class DeepLinksImpl
    extends BaseAdapter implements DeepLinks, Adaptable<DeepLinks, JSONObject>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<DeepLink> deepLinkList;

    public List<DeepLink> getDeepLinkList() {
        if (deepLinkList == null) {
            deepLinkList = new ArrayList<DeepLink>();
        }
        return this.deepLinkList;
    }

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter, this);
		for (DeepLink deepLink : getDeepLinkList()) {
			(getJSONArray(adapter, "DeepLink")).add(((DeepLinkImpl) deepLink).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		for (Object o : getJSONArray(adaptee, "DeepLink")) {
			DeepLinkImpl deepLink = new DeepLinkImpl();
			deepLink.adaptFrom((JSONObject) o);
			getDeepLinkList().add(deepLink);
		}
	}
}
