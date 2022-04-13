package com.letscode;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Time {
    public static void main(String args[]){
        // LocalDate
        LocalDate localDate = LocalDate.now();
        LocalDate localDateOf = LocalDate.of(2015, 02, 20);
        LocalDate localDateParsed = LocalDate.parse("2015-02-20");

        System.out.println(localDate);
        System.out.println(localDateOf);
        System.out.println(localDateParsed);

        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
        boolean leapYear = LocalDate.now().isLeapYear();
        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());

        //Convertendo para dd/mm/aaaa
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
        System.out.println(localDate.format(formatters));

        // ------------------------------------------------------- //
        LocalTime time = LocalTime.now();
        LocalTime timeOf = LocalTime.of(7, 02, 20);
        LocalTime timeParsed = LocalTime.parse("22:13:29");
        System.out.println(time);
        System.out.println(timeOf);
        System.out.println(timeParsed);

        // ------------------------------------------------------- //
        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime.parse("2015-02-20T06:30:00");

        // ------------------------------------------------------- //
        // ZonedDateTime
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        ZoneOffset offset = ZoneOffset.of("+02:00"); OffsetDateTime offSetByTwo = OffsetDateTime .of(localDateTime, offset);

        // ------------------------------------------------------- //
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
