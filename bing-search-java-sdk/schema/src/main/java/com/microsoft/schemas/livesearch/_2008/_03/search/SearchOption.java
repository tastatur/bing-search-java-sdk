
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DisableLocationDetection"/>
 *     &lt;enumeration value="EnableHighlighting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchOption")
@XmlEnum
public enum SearchOption {

    @XmlEnumValue("DisableLocationDetection")
    DISABLE_LOCATION_DETECTION("DisableLocationDetection"),
    @XmlEnumValue("EnableHighlighting")
    ENABLE_HIGHLIGHTING("EnableHighlighting");
    private final String value;

    SearchOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchOption fromValue(String v) {
        for (SearchOption c: SearchOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
