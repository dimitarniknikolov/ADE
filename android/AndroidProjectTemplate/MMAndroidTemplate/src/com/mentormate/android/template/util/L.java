
package com.mentormate.android.template.util;

import android.util.Log;

/**
 * @author MentorMate
 */
/**
 * Helper methods that make logging more consistent throughout the app.
 */
public class L {

    private static final String LOG_PREFIX = "AppName_";
    private static final int LOG_PREFIX_LENGTH = LOG_PREFIX.length();
    private static final int MAX_LOG_TAG_LENGTH = 23;

    /**
     * WARNING: Don't use this when obfuscating class names with Proguard!
     */
    public static String makeLogTag(Class<? extends Object> cls) {
        return makeLogTag(cls.getSimpleName());
    }

    private static String makeLogTag(String str) {
        if (str.length() > MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH) {
            return LOG_PREFIX + str.substring(0, MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH - 1);
        }
        return LOG_PREFIX + str;
    }

    /**
     * Send a {@link #DEBUG} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void d(final String tag, String message) {
        Log.d(tag, message);
    }

    /**
     * Send a {@link #DEBUG} log message and log the exception.
     * 
     * @param tag Used to identify the source of a log message. It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static void d(final String tag, String message, Throwable cause) {
        Log.d(tag, message, cause);
    }

    /**
     * Send a {@link #VERBOSE} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void v(final String tag, String message) {
        Log.v(tag, message);
    }

    /**
     * Send a {@link #VERBOSE} log message and log the exception.
     * 
     * @param tag Used to identify the source of a log message. It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static void v(final String tag, String message, Throwable cause) {
        Log.v(tag, message, cause);

    }

    /**
     * Send an {@link #INFO} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void i(final String tag, String message) {
        Log.i(tag, message);
    }

    /**
     * Send a {@link #INFO} log message and log the exception.
     * 
     * @param tag Used to identify the source of a log message. It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static void i(final String tag, String message, Throwable cause) {
        Log.i(tag, message, cause);
    }

    /**
     * Send a {@link #WARN} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void w(final String tag, String message) {
        Log.w(makeLogTag(tag), message);
    }

    /**
     * Send a {@link #WARN} log message and log the exception.
     * 
     * @param tag Used to identify the source of a log message. It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static void w(final String tag, String message, Throwable cause) {
        Log.w(makeLogTag(tag), message, cause);
    }

    /**
     * Send an {@link #ERROR} log message.
     * 
     * @param tag Used to identify the source of a log message. It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void e(final String tag, String message) {
        Log.e(makeLogTag(tag), message);
    }

    /**
     * Send a {@link #ERROR} log message and log the exception.
     * 
     * @param tag Used to identify the source of a log message. It usually identifies the class or
     *            activity where the log call occurs.
     * @param msg The message you would like logged.
     * @param tr An exception to log
     */
    public static void e(final String tag, String message, Throwable cause) {
        Log.e(makeLogTag(tag), message, cause);
    }
}
