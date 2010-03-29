
package com.google.code.bing.search.schema.adapter.jaxb.instantanswer;

import java.io.Serializable;

import com.google.code.bing.search.schema.instantanswer.InstantAnswerSpecificData;
public class InstantAnswerSpecificDataImpl
    implements Serializable, InstantAnswerSpecificData
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected FlightStatusImpl flightStatus;
    protected EncartaImpl encarta;

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus value) {
        this.flightStatus = ((FlightStatusImpl) value);
    }

    public Encarta getEncarta() {
        return encarta;
    }

    public void setEncarta(Encarta value) {
        this.encarta = ((EncartaImpl) value);
    }

}
