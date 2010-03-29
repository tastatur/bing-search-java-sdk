
package com.google.code.bing.search.schema.web.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.web.DeepLink;
import com.google.code.bing.search.schema.web.DeepLinks;
public class DeepLinksImpl
    implements Serializable, DeepLinks
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected List<DeepLink> deepLinkList;

    public List<DeepLink> getDeepLinkList() {
        if (deepLinkList == null) {
            deepLinkList = new ArrayList<DeepLink>();
        }
        return this.deepLinkList;
    }

}
