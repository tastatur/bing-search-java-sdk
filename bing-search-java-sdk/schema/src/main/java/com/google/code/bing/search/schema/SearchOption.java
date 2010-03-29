
package com.google.code.bing.search.schema;

public enum SearchOption {

    DISABLE_LOCATION_DETECTION("DisableLocationDetection"),
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
