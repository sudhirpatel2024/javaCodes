package com.codewithharry;

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//
//
//
//
//
//
//        //calculator
//        Scanner sc=new Scanner(System.in);
//        double a= sc.nextInt();
//        double b= sc.nextInt();
//        double sum =a+b;
//        System.out.println(sum);
//        double Multiplication=a*b;
//        System.out.println(Multiplication);
//        double Subtraction=a-b;
//        System.out.println(Subtraction);
//        double division =a/b;
//        System.out.println(division);
//        double modulo=a%b;
//        System.out.println(modulo);
//
//
//
//
//    }
//}



import java.util.*;


class Main{


    public static void main(String args[]){
        Date d=new Date();
        System.out.println(d);
        GregorianCalendar g=new GregorianCalendar();
        System.out.println(g.get(Calendar.YEAR));
        TimeZone tz=g.getTimeZone();
        System.out.println(tz.getID());
    }
}