/**
 * 
 */
package com.google.code.bing.search.schema.adapter;

import java.io.Serializable;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @author nmukhtar
 *
 */
public abstract class BaseAdapter implements Serializable {
	protected void copyProperties(Object dest, Object src) {
		try {
			BeanUtils.copyProperties(dest, src);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
