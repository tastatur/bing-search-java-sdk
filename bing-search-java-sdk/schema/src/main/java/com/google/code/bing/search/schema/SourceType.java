/*
 * Copyright 2010 Nabeel Mukhtar 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 * 
 */

package com.google.code.bing.search.schema;

/**
 * The Enum SourceType.
 */
public enum SourceType {

    /** The SPELL. */
    SPELL("Spell"),
    
    /** The WEB. */
    WEB("Web"),
    
    /** The IMAGE. */
    IMAGE("Image"),
    
    /** The RELATE d_ search. */
    RELATED_SEARCH("RelatedSearch"),
    
    /** The PHONEBOOK. */
    PHONEBOOK("Phonebook"),
    
    /** The SHOWTIMES. */
    SHOWTIMES("Showtimes"),
    
    /** The WEATHER. */
    WEATHER("Weather"),
    
    /** The VIDEO. */
    VIDEO("Video"),
    
    /** The AD. */
    AD("Ad"),
    
    /** The X_ rank. */
    X_RANK("XRank"),
    
    /** The INSTAN t_ answer. */
    INSTANT_ANSWER("InstantAnswer"),
    
    /** The NEWS. */
    NEWS("News"),
    
    /** The QUER y_ location. */
    QUERY_LOCATION("QueryLocation"),
    
    /** The MOBIL e_ web. */
    MOBILE_WEB("MobileWeb"),
    
    /** The TRANSLATION. */
    TRANSLATION("Translation");
    
    /** The value. */
    private final String value;

    /**
     * Instantiates a new source type.
     * 
     * @param v the v
     */
    SourceType(String v) {
        value = v;
    }

    /**
     * Value.
     * 
     * @return the string
     */
    public String value() {
        return value;
    }

    /**
     * From value.
     * 
     * @param v the v
     * 
     * @return the source type
     */
    public static SourceType fromValue(String v) {
        for (SourceType c: SourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
