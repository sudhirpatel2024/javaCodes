package com.codewithharry;

import java.util.Scanner;

public class switch_condition {
    public static void main(String[] args) {

        // user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

//        Scanner sc =new Scanner(System.in);
//        int month=sc.nextInt();
//        int month=5;
//        switch (month){
//            case 1:
//                System.out.println("january");
//                break;
//            case 2:
//                System.out.println("february");
//                break;
//            case 3:
//                System.out.println("march");
//                break;
//            case 4:
//                System.out.println("april");
//                break;
//            case 5:
//                System.out.println("may");
//                break;
//            case 6:
//                System.out.println("june");
//                break;
//            case 7:
//                System.out.println("july");
//                break;
//            case 8:
//                System.out.println("august");
//                break;
//            case 9:
//                System.out.println("september");
//                break;
//            case 10:
//                System.out.println("october");
//                break;
//            case 11:
//                System.out.println("november");
//                break;
//            case 12:
//                System.out.println("december");
//                break;
//            default:
//                System.out.println("invalid");
//        }


        Scanner sc=new Scanner(System.in);
        int button = sc.nextInt();
        switch (button){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid button");
        }


    }
}
