
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoSortOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoSortOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Relevance"/>
 *     &lt;enumeration value="Date"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoSortOption")
@XmlEnum
public enum VideoSortOption {

    @XmlEnumValue("Relevance")
    RELEVANCE("Relevance"),
    @XmlEnumValue("Date")
    DATE("Date");
    private final String value;

    VideoSortOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoSortOption fromValue(String v) {
        for (VideoSortOption c: VideoSortOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
