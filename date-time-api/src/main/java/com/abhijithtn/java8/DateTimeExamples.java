package com.abhijithtn.java8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;


public class DateTimeExamples {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println(time);

        System.out.println(LocalTime.now(ZoneId.of("Asia/Kolkata")));

        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));

        System.out.println(LocalDateTime.now().plusDays(10));

    }
}
