
package com.google.code.bing.search.schema.flightstatus;

import com.google.code.bing.search.schema.SchemaEntity;



public interface DestinationAirport
	extends SchemaEntity
{


    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCode();

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCode(String value);

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setName(String value);

    /**
     * Gets the value of the timeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getTimeZoneOffset();

    /**
     * Sets the value of the timeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTimeZoneOffset(Long value);

}
