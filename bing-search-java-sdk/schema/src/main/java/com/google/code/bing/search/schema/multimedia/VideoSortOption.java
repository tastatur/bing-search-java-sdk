
package com.google.code.bing.search.schema.multimedia;

public enum VideoSortOption {

    RELEVANCE("Relevance"),
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
