
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdultOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdultOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Off"/>
 *     &lt;enumeration value="Moderate"/>
 *     &lt;enumeration value="Strict"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdultOption")
@XmlEnum
public enum AdultOption {

    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("Moderate")
    MODERATE("Moderate"),
    @XmlEnumValue("Strict")
    STRICT("Strict");
    private final String value;

    AdultOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdultOption fromValue(String v) {
        for (AdultOption c: AdultOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
