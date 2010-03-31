
package com.google.code.bing.search.schema.adapter.soap.encarta;

import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.encarta.Encarta;
public class EncartaImpl
    extends BaseAdapter implements Encarta
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
