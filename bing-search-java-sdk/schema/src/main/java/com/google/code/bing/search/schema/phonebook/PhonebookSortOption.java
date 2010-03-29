
package com.google.code.bing.search.schema.phonebook;

public enum PhonebookSortOption {

    DEFAULT("Default"),
    RELEVANCE("Relevance"),
    DISTANCE("Distance");
    private final String value;

    PhonebookSortOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhonebookSortOption fromValue(String v) {
        for (PhonebookSortOption c: PhonebookSortOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
