
package com.google.code.bing.search.schema.web;

public enum WebSearchOption {

    DISABLE_HOST_COLLAPSING("DisableHostCollapsing"),
    DISABLE_QUERY_ALTERATIONS("DisableQueryAlterations");
    private final String value;

    WebSearchOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WebSearchOption fromValue(String v) {
        for (WebSearchOption c: WebSearchOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
