
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhonebookSortOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhonebookSortOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Relevance"/>
 *     &lt;enumeration value="Distance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhonebookSortOption")
@XmlEnum
public enum PhonebookSortOption {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Relevance")
    RELEVANCE("Relevance"),
    @XmlEnumValue("Distance")
    DISTANCE("Distance");
    private final String value;

    PhonebookSortOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhonebookSortOption fromValue(String v) {
        for (PhonebookSortOption c: PhonebookSortOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
