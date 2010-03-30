
package com.google.code.bing.search.schema.adapter.soap.web;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.web.WebRequest;
import com.google.code.bing.search.schema.web.WebSearchOption;

public class WebRequestImpl 
	extends BaseAdapter implements WebRequest
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
}
