
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileWebSearchOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MobileWebSearchOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DisableHostCollapsing"/>
 *     &lt;enumeration value="DisableQueryAlterations"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MobileWebSearchOption")
@XmlEnum
public enum MobileWebSearchOption {

    @XmlEnumValue("DisableHostCollapsing")
    DISABLE_HOST_COLLAPSING("DisableHostCollapsing"),
    @XmlEnumValue("DisableQueryAlterations")
    DISABLE_QUERY_ALTERATIONS("DisableQueryAlterations");
    private final String value;

    MobileWebSearchOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MobileWebSearchOption fromValue(String v) {
        for (MobileWebSearchOption c: MobileWebSearchOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
