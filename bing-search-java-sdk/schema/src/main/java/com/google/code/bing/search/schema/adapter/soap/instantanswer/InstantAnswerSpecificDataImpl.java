
package com.google.code.bing.search.schema.adapter.soap.instantanswer;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.adapter.soap.encarta.EncartaImpl;
import com.google.code.bing.search.schema.adapter.soap.flightstatus.FlightStatusImpl;
import com.google.code.bing.search.schema.encarta.Encarta;
import com.google.code.bing.search.schema.flightstatus.FlightStatus;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerSpecificData;
public class InstantAnswerSpecificDataImpl
    extends BaseAdapter implements InstantAnswerSpecificData, Adaptable<InstantAnswerSpecificData, String>
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

	@Override
	public void adaptFrom(String adaptee) {
		// TODO Auto-generated method stub
	}

	@Override
	public String adaptTo() {
		// TODO Auto-generated method stub
		return null;
	}
}
