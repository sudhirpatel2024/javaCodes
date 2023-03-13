package com.codewithharry;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;
public class DateTimeformat {
    public static void main(String args[]){
//        LocalDateTime dt=LocalDateTime.now();
//        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss ");
//        System.out.println(df.format(dt));

//        ZonedDateTime zdt=ZonedDateTime.now();
//        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy  hh:mm:ss  z Z");
//        System.out.println(df.format(zdt));

        LocalDateTime dt1=LocalDateTime.now();
        System.out.println(dt1.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dt1.get(ChronoField.ERA));

    }
}
