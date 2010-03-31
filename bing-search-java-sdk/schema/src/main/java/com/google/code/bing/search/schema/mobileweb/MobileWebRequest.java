package com.google.code.bing.search.schema.mobileweb;

import java.util.List;

import com.google.code.bing.search.schema.SchemaEntity;

public interface MobileWebRequest 
	extends SchemaEntity
{

	/**
	 * Gets the value of the offset property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	public Long getOffset();

	/**
	 * Sets the value of the offset property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Long }
	 *     
	 */
	public void setOffset(Long value);

	/**
	 * Gets the value of the count property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Long }
	 *     
	 */
	public Long getCount();

	/**
	 * Sets the value of the count property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link Long }
	 *     
	 */
	public void setCount(Long value);

	/**
	 * Gets the value of the options property.
	 * 
	 * @return
	 *     possible object is
	 *     
	 */
	public List<MobileWebSearchOption> getMobileWebSearchOptionList();

	/**
	 * Sets the value of the options property.
	 * 
	 * @param value
	 *     allowed object is
	 *     
	 */
	public void setOptions(List<MobileWebSearchOption> value);

}