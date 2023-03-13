package com.codewithharry;
import java.util.*;

public class CalendorAndTimejone {
    public static void main(String args[]){
//      GregorianCalendar  gc=new GregorianCalendar();
//        System.out.println(gc);
//        System.out.println(gc.get(Calendar.DATE));
//        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
//        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
//        System.out.println(gc.get(Calendar.YEAR));

        GregorianCalendar gcd=new GregorianCalendar();
        TimeZone tz=gcd.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getID());
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getDSTSavings());
    }
}
