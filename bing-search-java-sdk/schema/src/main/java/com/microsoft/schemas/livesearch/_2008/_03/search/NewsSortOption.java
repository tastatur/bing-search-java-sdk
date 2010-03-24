
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewsSortOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NewsSortOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Relevance"/>
 *     &lt;enumeration value="Date"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NewsSortOption")
@XmlEnum
public enum NewsSortOption {

    @XmlEnumValue("Relevance")
    RELEVANCE("Relevance"),
    @XmlEnumValue("Date")
    DATE("Date");
    private final String value;

    NewsSortOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NewsSortOption fromValue(String v) {
        for (NewsSortOption c: NewsSortOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
