
package com.google.code.bing.search.schema.instantanswer;

import com.google.code.bing.search.schema.SchemaEntity;
import com.google.code.bing.search.schema.encarta.Encarta;
import com.google.code.bing.search.schema.flightstatus.FlightStatus;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus}FlightStatus"/>
 *         &lt;element ref="{http://schemas.microsoft.com/LiveSearch/2008/04/XML/encarta}Encarta"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface InstantAnswerSpecificData
    extends SchemaEntity
{


    /**
     * Gets the value of the flightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatus }
     *     
     */
    FlightStatus getFlightStatus();

    /**
     * Sets the value of the flightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatus }
     *     
     */
    void setFlightStatus(FlightStatus value);

    /**
     * Gets the value of the encarta property.
     * 
     * @return
     *     possible object is
     *     {@link Encarta }
     *     
     */
    Encarta getEncarta();

    /**
     * Sets the value of the encarta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Encarta }
     *     
     */
    void setEncarta(Encarta value);

}
