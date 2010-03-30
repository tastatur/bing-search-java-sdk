
package com.google.code.bing.search.schema.adapter.json.encarta;

import com.google.code.bing.search.schema.adapter.Adaptable;
import com.google.code.bing.search.schema.adapter.BaseAdapter;
import com.google.code.bing.search.schema.encarta.Encarta;
public class EncartaImpl
    extends BaseAdapter implements Encarta, Adaptable<Encarta, com.microsoft.schemas.livesearch._2008._04.xml.encarta.Encarta>
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
	public com.microsoft.schemas.livesearch._2008._04.xml.encarta.Encarta adaptTo() {
		com.microsoft.schemas.livesearch._2008._04.xml.encarta.Encarta adapter = new com.microsoft.schemas.livesearch._2008._04.xml.encarta.Encarta();
		copyProperties(adapter   , this);
		return adapter;
	}

	@Override
	public void adaptFrom(
			com.microsoft.schemas.livesearch._2008._04.xml.encarta.Encarta adaptee) {
		copyProperties(this, adaptee);
	}
}
