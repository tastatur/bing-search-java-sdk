
package com.google.code.bing.search.schema.adapter.json.multimedia;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.multimedia.ImageRequest;

public class ImageRequestImpl 
	extends BaseAdapter implements ImageRequest
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
}
