
package com.google.code.bing.search.schema.adapter.jaxb.mobileweb;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.mobileweb.MobileWebRequest;
import com.google.code.bing.search.schema.mobileweb.MobileWebSearchOption;

public class MobileWebRequestImpl
	extends BaseAdapter implements MobileWebRequest
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2093282382303822168L;
	protected Long offset;
    protected Long count;
	protected List<MobileWebSearchOption> mobileWebSearchOptionList;

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
	public List<MobileWebSearchOption> getMobileWebSearchOptionList() {
		if (mobileWebSearchOptionList == null) {
			mobileWebSearchOptionList = new ArrayList<MobileWebSearchOption>();
		}
		return mobileWebSearchOptionList;
	}

	@Override
	public void setOptions(List<MobileWebSearchOption> value) {
		mobileWebSearchOptionList = value;
	}
}
