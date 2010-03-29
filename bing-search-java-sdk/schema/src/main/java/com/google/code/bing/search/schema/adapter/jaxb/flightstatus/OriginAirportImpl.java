
package com.google.code.bing.search.schema.adapter.jaxb.flightstatus;

import java.io.Serializable;
import com.google.code.bing.search.schema.flightstatus.OriginAirport;
public class OriginAirportImpl
    implements Serializable, OriginAirport
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String code;
    protected String name;
    protected Long timeZoneOffset;

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Long getTimeZoneOffset() {
        return timeZoneOffset;
    }

    public void setTimeZoneOffset(Long value) {
        this.timeZoneOffset = value;
    }

}
