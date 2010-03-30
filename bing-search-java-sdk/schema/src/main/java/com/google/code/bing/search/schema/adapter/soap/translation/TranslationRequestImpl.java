
package com.google.code.bing.search.schema.adapter.soap.translation;

import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.translation.TranslationRequest;

public class TranslationRequestImpl 
	extends BaseAdapter implements TranslationRequest
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -7166387890864766402L;
	protected String sourceLanguage;
    protected String targetLanguage;

    /**
     * Gets the value of the sourceLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLanguage() {
        return sourceLanguage;
    }

    /**
     * Sets the value of the sourceLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLanguage(String value) {
        this.sourceLanguage = value;
    }

    /**
     * Gets the value of the targetLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetLanguage() {
        return targetLanguage;
    }

    /**
     * Sets the value of the targetLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetLanguage(String value) {
        this.targetLanguage = value;
    }

}
