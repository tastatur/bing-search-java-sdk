
package com.google.code.bing.search.schema.adapter.soap.mobileweb;

import java.util.ArrayList;
import java.util.List;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.mobileweb.MobileWebRequest;
import com.google.code.bing.search.schema.mobileweb.MobileWebSearchOption;
import com.microsoft.schemas.livesearch._2008._03.search.ArrayOfMobileWebSearchOption;

public class MobileWebRequestImpl
	extends BaseAdapter implements MobileWebRequest, Adaptable<MobileWebRequest, com.microsoft.schemas.livesearch._2008._03.search.MobileWebRequest>
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

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._03.search.MobileWebRequest adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getOptions() != null) {
			for (com.microsoft.schemas.livesearch._2008._03.search.MobileWebSearchOption o : adaptee.getOptions().getMobileWebSearchOption()) {
				MobileWebSearchOption result = MobileWebSearchOption.valueOf(o.name()) ;
				getMobileWebSearchOptionList().add(result);
			}
		}
	}

	@Override
	public com.microsoft.schemas.livesearch._2008._03.search.MobileWebRequest adaptTo() {
		com.microsoft.schemas.livesearch._2008._03.search.MobileWebRequest adapter = new com.microsoft.schemas.livesearch._2008._03.search.MobileWebRequest();
		copyProperties(adapter , this);
		for (MobileWebSearchOption o : getMobileWebSearchOptionList()) {
			if (adapter.getOptions() == null) {
				adapter.setOptions(new ArrayOfMobileWebSearchOption());
			}
			adapter.getOptions().getMobileWebSearchOption().add(com.microsoft.schemas.livesearch._2008._03.search.MobileWebSearchOption.valueOf(o.name()));
		}
		
		return adapter;
	}
}
