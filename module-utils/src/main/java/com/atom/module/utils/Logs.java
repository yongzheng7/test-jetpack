package com.atom.module.utils;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@SuppressWarnings({"unused", "ClassWithTooManyMethods", "OverloadedVarargsMethod"})
public enum Logs {
    ;
    private static final int STACK_DEPTH = 4;
    public static final String DATE_FORMAT_LOG = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    public static String APPLICATION_ID = "atom";
    public static boolean init = false;

    public static void init(String id) {
        init = true;
        APPLICATION_ID = id;
    }

    /**
     * Returns the timestamp and caller of the log function.
     */
    private static String getLogPrefix() {
        String timestamp = new SimpleDateFormat(DATE_FORMAT_LOG, Locale.US).format(new Date());
        String caller = Thread.currentThread().getStackTrace()[STACK_DEPTH].toString();
        if (caller.startsWith(APPLICATION_ID)) {
            caller = caller.substring(APPLICATION_ID.length());
        }
        return timestamp + ": " + caller + ": ";
    }

    /**
     * Converts the given list of objects to a String.format-safe list of strings.
     *
     * @param args The objects to stringify.
     */
    private static Object[] argsToStrings(Object[] args) {
        String[] safeArgs = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            safeArgs[i] = args[i] == null ? "null" : args[i].toString();
        }
        return safeArgs;
    }

    public static void e(String msg) {
        if (!init) return;
        Log.e(APPLICATION_ID, getLogPrefix() + msg);
    }

    public static void e(String msg, Object... args) {
        if (!init) return;
        Log.e(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)));
    }

    public static void e(String msg, Throwable tr) {
        if (!init) return;
        Log.e(APPLICATION_ID, getLogPrefix() + msg, tr);
    }

    public static void e(String msg, Throwable tr, Object... args) {
        if (!init) return;
        Log.e(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)), tr);
    }

    public static void w(String msg) {
        if (!init) return;
        Log.w(APPLICATION_ID, getLogPrefix() + msg);
    }

    public static void w(String msg, Object... args) {
        if (!init) return;
        Log.w(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)));
    }

    public static void w(String msg, Throwable tr) {
        if (!init) return;
        Log.w(APPLICATION_ID, getLogPrefix() + msg, tr);
    }

    public static void w(String msg, Throwable tr, Object... args) {
        if (!init) return;
        Log.w(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)), tr);
    }

    public static void i(String msg) {
        if (!init) return;
        Log.i(APPLICATION_ID, getLogPrefix() + msg);
    }

    public static void i(String msg, Object... args) {
        if (!init) return;
        Log.i(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)));
    }

    public static void i(String msg, Throwable tr) {
        if (!init) return;
        Log.i(APPLICATION_ID, getLogPrefix() + msg, tr);
    }

    public static void i(String msg, Throwable tr, Object... args) {
        if (!init) return;
        Log.i(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)), tr);
    }

    public static void v(String msg) {
        if (!init) return;
        Log.v(APPLICATION_ID, getLogPrefix() + msg);
    }

    public static void v(String msg, Object... args) {
        if (!init) return;
        Log.v(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)));
    }

    public static void v(String msg, Throwable tr) {
        if (!init) return;
        Log.v(APPLICATION_ID, getLogPrefix() + msg, tr);
    }

    public static void v(String msg, Throwable tr, Object... args) {
        if (!init) return;
        Log.v(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)), tr);
    }

    public static void d(String msg) {
        if (!init) return;
        Log.d(APPLICATION_ID, getLogPrefix() + msg);
    }

    public static void d(String msg, Object... args) {
        if (!init) return;
        Log.d(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)));
    }

    public static void d(String msg, Throwable tr) {
        if (!init) return;
        Log.v(APPLICATION_ID, getLogPrefix() + msg, tr);
    }

    public static void d(String msg, Throwable tr, Object... args) {
        if (!init) return;
        Log.d(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)), tr);
    }

    public static void wtf(String msg) {
        if (!init) return;
        Log.wtf(APPLICATION_ID, getLogPrefix() + msg);
    }

    public static void wtf(String msg, Object... args) {
        if (!init) return;
        Log.wtf(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)));
    }

    public static void wtf(String msg, Throwable tr) {
        if (!init) return;
        Log.wtf(APPLICATION_ID, getLogPrefix() + msg, tr);
    }

    public static void wtf(String msg, Throwable tr, Object... args) {
        if (!init) return;
        Log.wtf(APPLICATION_ID, getLogPrefix() + String.format(msg, argsToStrings(args)), tr);
    }
}
