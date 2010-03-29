
package com.google.code.bing.search.schema.news;

public enum NewsSortOption {

    RELEVANCE("Relevance"),
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
