
package com.google.code.bing.search.schema.flightstatus;

import com.google.code.bing.search.schema.SchemaEntity;

public interface PreviousSegment
extends SchemaEntity
{


    /**
     * Gets the value of the flightHistoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getFlightHistoryId();

    /**
     * Sets the value of the flightHistoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFlightHistoryId(Long value);

    /**
     * Gets the value of the originAirport property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAirport }
     *     
     */
    OriginAirport getOriginAirport();

    /**
     * Sets the value of the originAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAirport }
     *     
     */
    void setOriginAirport(OriginAirport value);

    /**
     * Gets the value of the destinationAirport property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationAirport }
     *     
     */
    DestinationAirport getDestinationAirport();

    /**
     * Sets the value of the destinationAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationAirport }
     *     
     */
    void setDestinationAirport(DestinationAirport value);

}
