package com.abhijithtn.java8.strings;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringsJoinTest {

    @Test
    public void testJoinStrings() throws Exception {

        String[] strArr = new String[]{"Jai","Sri","Rama"};

        String output = StringsJoin.joinStrings(" ",strArr);

        Assert.assertEquals("Jai Sri Rama", output);
    }

    @Test
    public void testJoinIterableStrings() throws Exception {

        Iterable<String> strIterable = Arrays.asList("Jai","Sri","Rama");

        String output = StringsJoin.joinIterableStrings(" ",strIterable);

        Assert.assertEquals("Jai Sri Rama", output);

    }
}