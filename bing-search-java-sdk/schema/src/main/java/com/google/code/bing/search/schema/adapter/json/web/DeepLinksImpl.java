
package com.google.code.bing.search.schema.adapter.json.web;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.DeepLink;
import com.google.code.bing.search.schema.web.DeepLinks;
public class DeepLinksImpl
    extends BaseAdapter implements DeepLinks, Adaptable<DeepLinks, JSONArray>
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
	public JSONArray adaptTo() {
		JSONArray adapter = new JSONArray();
		for (DeepLink deepLink : getDeepLinkList()) {
			adapter.add(((DeepLinkImpl) deepLink).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONArray adaptee) {
		for (Object o : adaptee) {
			DeepLinkImpl deepLink = new DeepLinkImpl();
			deepLink.adaptFrom((JSONObject) o);
			getDeepLinkList().add(deepLink);
		}
	}
}
