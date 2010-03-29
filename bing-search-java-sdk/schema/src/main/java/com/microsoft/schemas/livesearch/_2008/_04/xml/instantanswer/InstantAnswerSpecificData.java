
package com.microsoft.schemas.livesearch._2008._04.xml.instantanswer;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas.livesearch._2008._04.xml.element.flightstatus.FlightStatus;
import com.microsoft.schemas.livesearch._2008._04.xml.encarta.Encarta;


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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flightStatus",
    "encarta"
})
@XmlRootElement(name = "InstantAnswerSpecificData")
public class InstantAnswerSpecificData
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "FlightStatus", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/element/flightstatus")
    protected FlightStatus flightStatus;
    @XmlElement(name = "Encarta", namespace = "http://schemas.microsoft.com/LiveSearch/2008/04/XML/encarta")
    protected Encarta encarta;

    /**
     * Gets the value of the flightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatus }
     *     
     */
    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    /**
     * Sets the value of the flightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatus }
     *     
     */
    public void setFlightStatus(FlightStatus value) {
        this.flightStatus = value;
    }

    /**
     * Gets the value of the encarta property.
     * 
     * @return
     *     possible object is
     *     {@link Encarta }
     *     
     */
    public Encarta getEncarta() {
        return encarta;
    }

    /**
     * Sets the value of the encarta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Encarta }
     *     
     */
    public void setEncarta(Encarta value) {
        this.encarta = value;
    }

}
