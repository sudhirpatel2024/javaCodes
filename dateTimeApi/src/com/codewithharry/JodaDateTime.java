package com.codewithharry;
import java.time.*;
import java.util.*;

public class JodaDateTime {
    public static void main(String args[]){
//        Date d=new Date();
//        System.out.println(d);
//        d.setHours(21);
//        System.out.println(d);

//        LocalDate d=LocalDate.now(ZoneId.of("Asia/Kolkata"));
//        System.out.println(d);
//
//        LocalDate d1=LocalDate.now();
//        System.out.println(d1);

//        LocalDate d2=LocalDate.of(2020, Month.MARCH,10);
//        System.out.println(d2);
//
//        LocalDate d3=LocalDate.ofEpochDay(10);
//        System.out.println(d3);

//        LocalDate d4=LocalDate.parse("2020-01-03");
//        LocalDate d5=d4.plusMonths(6);
//        System.out.println(d5);

//        LocalTime t=LocalTime.now();
//        System.out.println(t);
//       LocalTime t1= t.minusHours(4);
//        System.out.println(t1);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        System.out.println(dt.getDayOfMonth());



    }
}
