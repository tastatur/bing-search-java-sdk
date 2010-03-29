package com.google.code.bing.search.schema.multimedia;

import java.util.List;

public interface VideoRequest {

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
	 * Gets the value of the filters property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link }
	 *     
	 */
	public List<String> getFilterList();

	/**
	 * Sets the value of the filters property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link }
	 *     
	 */
	public void setFilterList(List<String> value);

	/**
	 * Gets the value of the sortBy property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link VideoSortOption }
	 *     
	 */
	public VideoSortOption getSortBy();

	/**
	 * Sets the value of the sortBy property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link VideoSortOption }
	 *     
	 */
	public void setSortBy(VideoSortOption value);

}