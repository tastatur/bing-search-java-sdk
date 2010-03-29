
package com.google.code.bing.search.schema.translation.impl;

import java.io.Serializable;

import com.google.code.bing.search.schema.translation.TranslationResult;
public class TranslationResultImpl
    implements Serializable, TranslationResult
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String translatedTerm;

    public String getTranslatedTerm() {
        return translatedTerm;
    }

    public void setTranslatedTerm(String value) {
        this.translatedTerm = value;
    }

}
