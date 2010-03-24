
package com.microsoft.schemas.livesearch._2008._03.search;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Spell"/>
 *     &lt;enumeration value="Web"/>
 *     &lt;enumeration value="Image"/>
 *     &lt;enumeration value="RelatedSearch"/>
 *     &lt;enumeration value="Phonebook"/>
 *     &lt;enumeration value="Showtimes"/>
 *     &lt;enumeration value="Weather"/>
 *     &lt;enumeration value="Video"/>
 *     &lt;enumeration value="Ad"/>
 *     &lt;enumeration value="XRank"/>
 *     &lt;enumeration value="InstantAnswer"/>
 *     &lt;enumeration value="News"/>
 *     &lt;enumeration value="QueryLocation"/>
 *     &lt;enumeration value="MobileWeb"/>
 *     &lt;enumeration value="Translation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SourceType")
@XmlEnum
public enum SourceType {

    @XmlEnumValue("Spell")
    SPELL("Spell"),
    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("RelatedSearch")
    RELATED_SEARCH("RelatedSearch"),
    @XmlEnumValue("Phonebook")
    PHONEBOOK("Phonebook"),
    @XmlEnumValue("Showtimes")
    SHOWTIMES("Showtimes"),
    @XmlEnumValue("Weather")
    WEATHER("Weather"),
    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("Ad")
    AD("Ad"),
    @XmlEnumValue("XRank")
    X_RANK("XRank"),
    @XmlEnumValue("InstantAnswer")
    INSTANT_ANSWER("InstantAnswer"),
    @XmlEnumValue("News")
    NEWS("News"),
    @XmlEnumValue("QueryLocation")
    QUERY_LOCATION("QueryLocation"),
    @XmlEnumValue("MobileWeb")
    MOBILE_WEB("MobileWeb"),
    @XmlEnumValue("Translation")
    TRANSLATION("Translation");
    private final String value;

    SourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SourceType fromValue(String v) {
        for (SourceType c: SourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
