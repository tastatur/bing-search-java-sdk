
package com.google.code.bing.search.schema.adapter.jaxb.multimedia;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.VideoRequest;
import com.google.code.bing.search.schema.multimedia.VideoSortOption;

public class VideoRequestImpl 
	extends BaseAdapter implements VideoRequest
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -387064944800851035L;
	protected Long offset;
    protected Long count;
    protected VideoSortOption sortBy;
	protected List<String> filterList;

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
     * Gets the value of the sortBy property.
     * 
     * @return
     *     possible object is
     *     {@link VideoSortOption }
     *     
     */
    public VideoSortOption getSortBy() {
        return sortBy;
    }

    /**
     * Sets the value of the sortBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSortOption }
     *     
     */
    public void setSortBy(VideoSortOption value) {
        this.sortBy = value;
    }

	@Override
	public List<String> getFilterList() {
		if (filterList == null) {
			filterList = new ArrayList<String>();
		}
		return filterList;
	}

	@Override
	public void setFilterList(List<String> value) {
		filterList = value;
	}

}
