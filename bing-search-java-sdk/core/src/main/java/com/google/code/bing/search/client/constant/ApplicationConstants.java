/**
 *
 */
package com.google.code.bing.search.client.constant;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class ApplicationConstants.
 *
 * @author Nabeel Mukhtar
 */
public final class ApplicationConstants {

    /** The Constant APP_CONSTANTS_FILE. */
    public static final String APP_CONSTANTS_FILE = "ApplicationConstants.properties";

    /** The static logger. */
    private static final Logger LOG = Logger.getLogger(ApplicationConstants.class.getCanonicalName());
    
    /** The Constant applicationConstants. */
    private static final Properties applicationConstants = new Properties();

    static {
        try {
            applicationConstants.load(
                ApplicationConstants.class.getResourceAsStream(APP_CONSTANTS_FILE));
        } catch (IOException e) {
            LOG.log(Level.SEVERE, "An error occurred while loading properties.", e);
        }
    }
    
    /** The Constant CONTENT_TYPE_XML. */
    public static final String CONTENT_TYPE_XML = getProperty("com.google.code.bing.search.client.contentTypeXml");

    /** The Constant CONTENT_ENCODING. */
    public static final String CONTENT_ENCODING = getProperty("com.google.code.bing.search.client.encoding");
    
    /**
     * Instantiates a new application constants.
     */
    private ApplicationConstants() {}

    /**
     * Get property as int.
     */
    public static String getProperty(String key) {
        return applicationConstants.getProperty(key);
    }

    /**
     * Get property as int.
     */
    public static int getIntProperty(String key) {
        String property = applicationConstants.getProperty(key);

        if (isNullOrEmpty(property)) {
            return 0;
        } else {
            return Integer.parseInt(property);
        }
    }

    /**
     * Get property as boolean.
     */
    public static boolean getBooleanProperty(String key) {
        String property = applicationConstants.getProperty(key);

        if (isNullOrEmpty(property)) {
            return false;
        } else {
            return Boolean.parseBoolean(property);
        }
    }

    /**
     * Get property as double.
     */
    public static double getDoubleProperty(String key) {
        String property = applicationConstants.getProperty(key);

        if (isNullOrEmpty(property)) {
            return 0;
        } else {
            return Double.parseDouble(property);
        }
    }

    /**
     * Get property as long.
     */
    public static long getLongProperty(String key) {
        String property = applicationConstants.getProperty(key);

        if (isNullOrEmpty(property)) {
            return 0;
        } else {
            return Long.parseLong(property);
        }
    }

    /**
     * Get property as long.
     */
    private static boolean isNullOrEmpty(String s) {
        return ((s == null) || s.length() == 0);
    }
}
