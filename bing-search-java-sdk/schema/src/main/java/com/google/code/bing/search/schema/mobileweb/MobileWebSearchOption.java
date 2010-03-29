
package com.google.code.bing.search.schema.mobileweb;

public enum MobileWebSearchOption {

    DISABLE_HOST_COLLAPSING("DisableHostCollapsing"),
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
