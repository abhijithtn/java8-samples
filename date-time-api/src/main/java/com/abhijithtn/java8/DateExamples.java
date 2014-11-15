package com.abhijithtn.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;


public class DateExamples {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());

        System.out.println(LocalDate.of(1973, Month.APRIL, 24));

        System.out.println(LocalDate.now().getDayOfWeek());

        System.out.println(LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth()));
    }
}
