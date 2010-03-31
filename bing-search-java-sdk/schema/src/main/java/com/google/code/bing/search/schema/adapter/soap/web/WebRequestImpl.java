
package com.google.code.bing.search.schema.adapter.soap.web;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.WebRequest;
import com.google.code.bing.search.schema.web.WebSearchOption;
import com.microsoft.schemas.livesearch._2008._03.search.ArrayOfString;
import com.microsoft.schemas.livesearch._2008._03.search.ArrayOfWebSearchOption;

public class WebRequestImpl 
	extends BaseAdapter implements WebRequest, Adaptable<WebRequest, com.microsoft.schemas.livesearch._2008._03.search.WebRequest>
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2076030033305153442L;
	protected Long offset;
    protected Long count;
    protected String fileType;
    protected List<String> searchTagList;
    protected List<WebSearchOption> webSearchOptionList;

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOffset(Long value) {
        this.offset = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCount(Long value) {
        this.count = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

	@Override
	public List<String> getSearchTagList() {
		if (searchTagList == null) {
			searchTagList = new ArrayList<String>();
		}
		return searchTagList;
	}

	@Override
	public List<WebSearchOption> getWebSearchOptionList() {
		if (webSearchOptionList == null) {
			webSearchOptionList = new ArrayList<WebSearchOption>();
		}
		return webSearchOptionList;
	}

	@Override
	public void setSearchTagList(List<String> value) {
		searchTagList = value;
	}

	@Override
	public void setWebSearchOptionList(List<WebSearchOption> value) {
		webSearchOptionList = value;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.WebRequest adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getSearchTags() != null) {
			for (String result : adaptee.getSearchTags().getString()) {
				getSearchTagList().add(result);
			}
		}
		if (adaptee.getOptions() != null) {
			for (com.microsoft.schemas.livesearch._2008._03.search.WebSearchOption o : adaptee.getOptions().getWebSearchOption()) {
				WebSearchOption result = WebSearchOption.valueOf(o.name()) ;
				getWebSearchOptionList().add(result);
			}
		}
	}

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.WebRequest adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.WebRequest adapter = new com.microsoft.schemas.livesearch._2008._03.search.WebRequest();
		copyProperties(adapter , this);
		for (String o : getSearchTagList()) {
			if (adapter.getSearchTags() == null) {
				adapter.setSearchTags(new ArrayOfString());
			}
			adapter.getSearchTags().getString().add(o);
		}
		for (WebSearchOption o : getWebSearchOptionList()) {
			if (adapter.getOptions() == null) {
				adapter.setOptions(new ArrayOfWebSearchOption());
			}
			adapter.getOptions().getWebSearchOption().add(com.microsoft.schemas.livesearch._2008._03.search.WebSearchOption.valueOf(o.name()));
		}
		return adapter;
	}
}
