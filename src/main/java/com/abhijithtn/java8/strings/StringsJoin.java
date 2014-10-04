package com.abhijithtn.java8.strings;

/**
 * Created by abhi on 05/10/14.
 */
public class StringsJoin {


    public static String joinStrings(String delimiter, String... strings) {
        if (strings == null || strings.length == 0 || delimiter == null || delimiter.isEmpty()) {
            throw new IllegalArgumentException("Expecting valid delimiter and valid list of strings");
        }

        return String.join(delimiter, strings);
    }

    public static String joinIterableStrings(String delimiter, Iterable<String> iterable) {
        if (iterable == null || delimiter == null || delimiter.isEmpty()) {
            throw new IllegalArgumentException("Expecting valid delimiter and valid collection of strings");
        }
        return String.join(delimiter, iterable);
    }


}
