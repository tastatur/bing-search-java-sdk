package com.google.code.bing.search.schema.translation;

public interface TranslationRequest {

	/**
	 * Gets the value of the sourceLanguage property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getSourceLanguage();

	/**
	 * Sets the value of the sourceLanguage property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setSourceLanguage(String value);

	/**
	 * Gets the value of the targetLanguage property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public String getTargetLanguage();

	/**
	 * Sets the value of the targetLanguage property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link String }
	 *     
	 */
	public void setTargetLanguage(String value);

}