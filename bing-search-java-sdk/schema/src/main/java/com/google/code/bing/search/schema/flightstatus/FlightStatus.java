
package com.google.code.bing.search.schema.flightstatus;

import com.google.code.bing.search.schema.SchemaEntity;



public interface FlightStatus
extends SchemaEntity
{


    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAirlineCode();

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAirlineCode(String value);

    /**
     * Gets the value of the airlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAirlineName();

    /**
     * Sets the value of the airlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAirlineName(String value);

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getFlightNumber();

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFlightNumber(Long value);

    /**
     * Gets the value of the flightName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getFlightName();

    /**
     * Sets the value of the flightName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setFlightName(String value);

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
     * Gets the value of the statusString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getStatusString();

    /**
     * Sets the value of the statusString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setStatusString(String value);

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getStatusCode();

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setStatusCode(Long value);

    /**
     * Gets the value of the onTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getOnTimeString();

    /**
     * Sets the value of the onTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setOnTimeString(String value);

    /**
     * Gets the value of the scheduledDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getScheduledDeparture();

    /**
     * Sets the value of the scheduledDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setScheduledDeparture(String value);

    /**
     * Gets the value of the updatedDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getUpdatedDeparture();

    /**
     * Sets the value of the updatedDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUpdatedDeparture(String value);

    /**
     * Gets the value of the scheduledArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getScheduledArrival();

    /**
     * Sets the value of the scheduledArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setScheduledArrival(String value);

    /**
     * Gets the value of the updatedArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getUpdatedArrival();

    /**
     * Sets the value of the updatedArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setUpdatedArrival(String value);

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

    /**
     * Gets the value of the departureGate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getDepartureGate();

    /**
     * Sets the value of the departureGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDepartureGate(Long value);

    /**
     * Gets the value of the departureTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDepartureTerminal();

    /**
     * Sets the value of the departureTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDepartureTerminal(String value);

    /**
     * Gets the value of the arrivalGate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getArrivalGate();

    /**
     * Sets the value of the arrivalGate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArrivalGate(Long value);

    /**
     * Gets the value of the arrivalTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getArrivalTerminal();

    /**
     * Sets the value of the arrivalTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setArrivalTerminal(String value);

    /**
     * Gets the value of the previousSegment property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousSegment }
     *     
     */
    PreviousSegment getPreviousSegment();

    /**
     * Sets the value of the previousSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousSegment }
     *     
     */
    void setPreviousSegment(PreviousSegment value);

    /**
     * Gets the value of the nextSegment property.
     * 
     * @return
     *     possible object is
     *     {@link NextSegment }
     *     
     */
    NextSegment getNextSegment();

    /**
     * Sets the value of the nextSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NextSegment }
     *     
     */
    void setNextSegment(NextSegment value);

    /**
     * Gets the value of the dataFreshness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    Long getDataFreshness();

    /**
     * Sets the value of the dataFreshness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDataFreshness(Long value);

}
