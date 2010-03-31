
package com.google.code.bing.search.schema.adapter.soap.multimedia;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageRequest;
import com.microsoft.schemas.livesearch._2008._03.search.ArrayOfString;

public class ImageRequestImpl 
	extends BaseAdapter implements ImageRequest, Adaptable<ImageRequest, com.microsoft.schemas.livesearch._2008._03.search.ImageRequest>
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -1726990456300068785L;
	protected Long offset;
    protected Long count;
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
			com.microsoft.schemas.livesearch._2008._03.search.ImageRequest adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getFilters() != null) {
			for (String result : adaptee.getFilters().getString()) {
				getFilterList().add(result);
			}
		}
	}

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.ImageRequest adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.ImageRequest adapter = new com.microsoft.schemas.livesearch._2008._03.search.ImageRequest();
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
