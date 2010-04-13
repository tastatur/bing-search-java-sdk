package com.google.code.bing.search.schema.ads;

import com.google.code.bing.search.schema.SchemaEntity;

public interface AdRequest 
	extends SchemaEntity
{

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getPageNumber();

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPageNumber(Long value);

	/**
	 * Gets the value of the targetLanguage property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getAdUnitId();

	/**
	 * Sets the value of the targetLanguage property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setAdUnitId(String value);

	/**
	 * Gets the value of the targetLanguage property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getPropertyId();

	/**
	 * Sets the value of the targetLanguage property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setPropertyId(String value);
	
	/**
	 * Gets the value of the targetLanguage property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getChannelId();

	/**
	 * Sets the value of the targetLanguage property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setChannelId(String value);
	
	/**
	 * Gets the value of the targetLanguage property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getMlAdCount();

	/**
	 * Sets the value of the targetLanguage property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setMlAdCount(String value);
	
	/**
	 * Gets the value of the targetLanguage property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getSbAdCount();

	/**
	 * Sets the value of the targetLanguage property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setSbAdCount(String value);
}