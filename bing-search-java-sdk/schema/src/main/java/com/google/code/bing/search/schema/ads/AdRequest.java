/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */
package com.google.code.bing.search.schema.ads;


/**
 * The Interface AdRequest.
 */
public interface AdRequest 
//	extends SchemaEntity
{

    /**
     * Gets the page number.
     * 
     * @return the page number
     */
    Long getPageNumber();

    /**
     * Sets the page number.
     * 
     * @param value the new page number
     */
    void setPageNumber(Long value);

	/**
	 * Gets the ad unit id.
	 * 
	 * @return the ad unit id
	 */
	public String getAdUnitId();

	/**
	 * Sets the ad unit id.
	 * 
	 * @param value the new ad unit id
	 */
	public void setAdUnitId(String value);

	/**
	 * Gets the property id.
	 * 
	 * @return the property id
	 */
	public String getPropertyId();

	/**
	 * Sets the property id.
	 * 
	 * @param value the new property id
	 */
	public void setPropertyId(String value);
	
	/**
	 * Gets the channel id.
	 * 
	 * @return the channel id
	 */
	public String getChannelId();

	/**
	 * Sets the channel id.
	 * 
	 * @param value the new channel id
	 */
	public void setChannelId(String value);
	
	/**
	 * Gets the ml ad count.
	 * 
	 * @return the ml ad count
	 */
	public String getMlAdCount();

	/**
	 * Sets the ml ad count.
	 * 
	 * @param value the new ml ad count
	 */
	public void setMlAdCount(String value);
	
	/**
	 * Gets the sb ad count.
	 * 
	 * @return the sb ad count
	 */
	public String getSbAdCount();

	/**
	 * Sets the sb ad count.
	 * 
	 * @param value the new sb ad count
	 */
	public void setSbAdCount(String value);
}