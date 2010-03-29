
package com.google.code.bing.search.schema.adapter.jaxb.instantanswer;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.jaxb.encarta.EncartaImpl;
import com.google.code.bing.search.schema.adapter.jaxb.flightstatus.FlightStatusImpl;
import com.google.code.bing.search.schema.encarta.Encarta;
import com.google.code.bing.search.schema.flightstatus.FlightStatus;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerSpecificData;
public class InstantAnswerSpecificDataImpl
    implements Serializable, InstantAnswerSpecificData, Adaptable<InstantAnswerSpecificData, com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswerSpecificData>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswerSpecificData toAdaptee(
			InstantAnswerSpecificData adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InstantAnswerSpecificData toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.instantanswer.InstantAnswerSpecificData adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
