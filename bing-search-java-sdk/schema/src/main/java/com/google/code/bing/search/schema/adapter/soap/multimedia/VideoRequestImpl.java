
package com.google.code.bing.search.schema.adapter.soap.multimedia;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.VideoRequest;
import com.google.code.bing.search.schema.multimedia.VideoSortOption;
import com.microsoft.schemas.livesearch._2008._03.search.ArrayOfString;

public class VideoRequestImpl 
	extends BaseAdapter implements VideoRequest, Adaptable<VideoRequest, com.microsoft.schemas.livesearch._2008._03.search.VideoRequest>
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

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.VideoRequest adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getFilters() != null) {
			for (String result : adaptee.getFilters().getString()) {
				getFilterList().add(result);
			}
		}
	}

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.VideoRequest adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.VideoRequest adapter = new com.microsoft.schemas.livesearch._2008._03.search.VideoRequest();
		copyProperties(adapter , this);
		for (String o : getFilterList()) {
			if (adapter.getFilters() == null) {
				adapter.setFilters(new ArrayOfString());
			}
			adapter.getFilters().getString().add(o);
		}
		return adapter;
	}
}
