package com.google.code.bing.search.schema.phonebook;

public interface PhonebookRequest {

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
	 * Gets the value of the fileType property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getFileType();

	/**
	 * Sets the value of the fileType property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setFileType(String value);

	/**
	 * Gets the value of the sortBy property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link PhonebookSortOption }
	 *     
	 */
	public PhonebookSortOption getSortBy();

	/**
	 * Sets the value of the sortBy property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link PhonebookSortOption }
	 *     
	 */
	public void setSortBy(PhonebookSortOption value);

	/**
	 * Gets the value of the locId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getLocId();

	/**
	 * Sets the value of the locId property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setLocId(String value);

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

}