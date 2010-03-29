
package com.google.code.bing.search.schema;

public enum SourceType {

    SPELL("Spell"),
    WEB("Web"),
    IMAGE("Image"),
    RELATED_SEARCH("RelatedSearch"),
    PHONEBOOK("Phonebook"),
    SHOWTIMES("Showtimes"),
    WEATHER("Weather"),
    VIDEO("Video"),
    AD("Ad"),
    X_RANK("XRank"),
    INSTANT_ANSWER("InstantAnswer"),
    NEWS("News"),
    QUERY_LOCATION("QueryLocation"),
    MOBILE_WEB("MobileWeb"),
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
