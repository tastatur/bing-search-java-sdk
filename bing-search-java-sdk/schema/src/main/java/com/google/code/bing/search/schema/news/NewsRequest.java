package com.google.code.bing.search.schema.news;

public interface NewsRequest {

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
	 * Gets the value of the locationOverride property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getLocationOverride();

	/**
	 * Sets the value of the locationOverride property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setLocationOverride(String value);

	/**
	 * Gets the value of the category property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getCategory();

	/**
	 * Sets the value of the category property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setCategory(String value);

	/**
	 * Gets the value of the sortBy property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link NewsSortOption }
	 *     
	 */
	public NewsSortOption getSortBy();

	/**
	 * Sets the value of the sortBy property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link NewsSortOption }
	 *     
	 */
	public void setSortBy(NewsSortOption value);

}