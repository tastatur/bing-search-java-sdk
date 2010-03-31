/**
 * 
 */
package com.google.code.bing.search.schema.adapter;

import java.io.Serializable;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author nmukhtar
 *
 */
public abstract class BaseAdapter implements Serializable {
	
	/**
	 * Logging for this instance
	 */
	protected Log log = LogFactory.getLog(getClass());
	
	protected void copyProperties(Object dest, Object src) {
		try {
			BeanUtils.copyProperties(dest, src);
		} catch (Exception e) {
			log.error("Error while copying properties.", e);
		}		
	}
	@SuppressWarnings("unchecked")
	protected void copyProperties(Object dest, Map src) {
		try {
			BeanUtils.populate(dest, src);
		} catch (Exception e) {
			log.error("Error while copying properties.", e);
		}		
	}
	
	@SuppressWarnings("unchecked")
	protected void copyProperties(Map dest, Object src) {
		try {
			Map srcMap = BeanUtils.describe(src);
			dest.putAll(srcMap);
		} catch (Exception e) {
			log.error("Error while copying properties.", e);
		}		
	}
}
