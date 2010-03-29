package com.google.code.bing.search.schema.web;

import java.util.List;

public interface WebRequest {

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
	 * Gets the value of the options property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link  }
	 *     
	 */
	public List<WebSearchOption> getWebSearchOptionList();

	/**
	 * Sets the value of the options property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link  }
	 *     
	 */
	public void setWebSearchOptionList(List<WebSearchOption> value);

	/**
	 * Gets the value of the searchTags property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link  }
	 *     
	 */
	public List<String> getSearchTagList();

	/**
	 * Sets the value of the searchTags property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link  }
	 *     
	 */
	public void setSearchTagList(List<String> value);

}