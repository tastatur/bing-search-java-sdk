
package com.google.code.bing.search.schema.adapter.jaxb.instantanswer;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.adapter.jaxb.encarta.EncartaImpl;
import com.google.code.bing.search.schema.adapter.jaxb.flightstatus.FlightStatusImpl;
import com.google.code.bing.search.schema.encarta.Encarta;
import com.google.code.bing.search.schema.flightstatus.FlightStatus;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerSpecificData;
public class InstantAnswerSpecificDataImpl
    extends BaseAdapter implements InstantAnswerSpecificData, Adaptable<InstantAnswerSpecificData, com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswerSpecificData>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswerSpecificData adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswerSpecificData adapter = new com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswerSpecificData();
		copyProperties(adapter    , this);
		if (getFlightStatus() != null) {
			adapter.setFlightStatus(((FlightStatusImpl) getFlightStatus()).adaptTo());
		}
		if (getEncarta() != null) {
			adapter.setEncarta(((EncartaImpl) getEncarta()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswerSpecificData adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.getFlightStatus() != null) {
			FlightStatusImpl results = new FlightStatusImpl();
			results.adaptFrom(adaptee.getFlightStatus());
			setFlightStatus(results);
		}
		if (adaptee.getEncarta() != null) {
			EncartaImpl results = new EncartaImpl();
			results.adaptFrom(adaptee.getEncarta());
			setEncarta(results);
		}
	}
}
