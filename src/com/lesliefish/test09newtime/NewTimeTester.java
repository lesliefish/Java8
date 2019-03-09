package com.lesliefish.test09newtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class NewTimeTester {

    public static void test() {
        // 获取当前日期和时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month + " day: " + day + " seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2019);
        System.out.println("date2: " + date2);

        // 2019年3月9日
        LocalDate date3 = LocalDate.of(2019, Month.MARCH, 9);
        System.out.println("date3: " + date3);

        // 17:37
        LocalTime date4 = LocalTime.of(17, 37);
        System.out.println("date4: " + date4);

        // 从字符串解析
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }
}
