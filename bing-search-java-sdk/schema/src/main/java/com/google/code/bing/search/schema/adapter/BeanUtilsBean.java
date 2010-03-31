package com.google.code.bing.search.schema.adapter;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BeanUtilsBean extends org.apache.commons.beanutils.BeanUtilsBean {
	
	/**
	 * Logging for this instance
	 */
	private Log log = LogFactory.getLog(BeanUtilsBean.class);

	@SuppressWarnings("unchecked")
	public void copyProperties(Object dest, Object orig)
			throws IllegalAccessException, InvocationTargetException {

		// Validate existence of the specified beans
		if (dest == null) {
			throw new IllegalArgumentException("No destination bean specified");
		}
		if (orig == null) {
			throw new IllegalArgumentException("No origin bean specified");
		}
		if (log.isDebugEnabled()) {
			log.debug("BeanUtils.copyProperties(" + dest + ", " + orig + ")");
		}

		// Copy the properties, converting as necessary
		if (orig instanceof DynaBean) {
			super.copyProperties(dest, orig);
		} else if (orig instanceof Map) {
			Iterator entries = ((Map) orig).entrySet().iterator();
			while (entries.hasNext()) {
				Map.Entry entry = (Map.Entry) entries.next();
				String name = (String) entry.getKey();
				if (getPropertyUtils().isWriteable(dest, name)) {
					copyProperty(dest, name, entry.getValue());
				}
			}
		} else /* if (orig is a standard JavaBean) */{
			PropertyDescriptor[] origDescriptors = getPropertyUtils()
					.getPropertyDescriptors(orig);
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				if ("class".equals(name)) {
					continue; // No point in trying to set an object's class
				}
				if (getPropertyUtils().isReadable(orig, name)
						&& getPropertyUtils().isWriteable(dest, name)) {
					try {
						Object value = getPropertyUtils().getSimpleProperty(
								orig, name);
						if (includeProperty(name, value)) {
							copyProperty(dest, name, value);
						}
					} catch (NoSuchMethodException e) {
						// Should not happen
					}
				}
			}
		}

	}

	private boolean includeProperty(String name, Object value) {
		if (value != null) {
			return value.getClass().equals(String.class)
					|| value.getClass().isPrimitive()
					|| value.getClass().isEnum()
					|| value.getClass().equals(String.class)
					|| Number.class.isAssignableFrom(value.getClass());
		}
		return true;
	}
}
