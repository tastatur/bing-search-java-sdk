
package com.google.code.bing.search.schema.adapter.json.instantanswer;

import org.json.simple.JSONObject;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.adapter.json.encarta.EncartaImpl;
import com.google.code.bing.search.schema.adapter.json.flightstatus.FlightStatusImpl;
import com.google.code.bing.search.schema.encarta.Encarta;
import com.google.code.bing.search.schema.flightstatus.FlightStatus;
import com.google.code.bing.search.schema.instantanswer.InstantAnswerSpecificData;
public class InstantAnswerSpecificDataImpl
    extends BaseAdapter implements InstantAnswerSpecificData, Adaptable<InstantAnswerSpecificData, JSONObject>
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

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject adaptTo() {
		JSONObject adapter = new JSONObject();
		copyProperties(adapter    , this);
		if (getFlightStatus() != null) {
			adapter.put("FlightStatus", ((FlightStatusImpl) getFlightStatus()).adaptTo());
		}
		if (getEncarta() != null) {
			adapter.put("Encarta", ((EncartaImpl) getEncarta()).adaptTo());
		}
		return adapter;
	}

	@Override
	public void adaptFrom(
			JSONObject adaptee) {
		copyProperties(this, adaptee);
		if (adaptee.get("FlightStatus") != null) {
			FlightStatusImpl results = new FlightStatusImpl();
			results.adaptFrom((JSONObject) adaptee.get("FlightStatus"));
			setFlightStatus(results);
		}
		if (adaptee.get("Encarta") != null) {
			EncartaImpl results = new EncartaImpl();
			results.adaptFrom((JSONObject) adaptee.get("Encarta"));
			setEncarta(results);
		}
	}
}
