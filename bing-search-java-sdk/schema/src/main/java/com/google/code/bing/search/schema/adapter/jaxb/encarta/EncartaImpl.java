
package com.google.code.bing.search.schema.adapter.jaxb.encarta;

import java.io.Serializable;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.encarta.Encarta;
public class EncartaImpl
    implements Serializable, Encarta, Adaptable<Encarta, com.microsoft.schemas.livesearch._2008._04.xml.encarta.Encarta>
{

    private final static long serialVersionUID = 2461660169443089969L;
    protected String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	@Override
	public com.microsoft.schemas.livesearch._2008._04.xml.encarta.Encarta toAdaptee(
			Encarta adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Encarta toAdapter(
			com.microsoft.schemas.livesearch._2008._04.xml.encarta.Encarta adaptee) {
		// TODO Auto-generated method stub
		return null;
	}

}
