
package com.google.code.bing.search.schema.instantanswer.impl;

import java.io.Serializable;

import com.google.code.bing.search.schema.encarta.Encarta;
import com.google.code.bing.search.schema.encarta.impl.EncartaImpl;
import com.google.code.bing.search.schema.flightstatus.FlightStatus;
import com.google.code.bing.search.schema.flightstatus.impl.FlightStatusImpl;
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
