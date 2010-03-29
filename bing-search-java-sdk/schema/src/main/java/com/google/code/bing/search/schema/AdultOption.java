
package com.google.code.bing.search.schema;

public enum AdultOption {

    OFF("Off"),
    MODERATE("Moderate"),
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
