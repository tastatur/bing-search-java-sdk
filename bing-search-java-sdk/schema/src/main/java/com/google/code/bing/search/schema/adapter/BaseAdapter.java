/**
 * 
 */
package com.google.code.bing.search.schema.adapter;

import java.io.Serializable;
import java.util.Map;

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
	@SuppressWarnings("unchecked")
	protected void copyProperties(Object dest, Map src) {
		try {
			BeanUtils.populate(dest, src);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@SuppressWarnings("unchecked")
	protected void copyProperties(Map dest, Object src) {
		try {
			Map srcMap = BeanUtils.describe(src);
			dest.putAll(srcMap);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
