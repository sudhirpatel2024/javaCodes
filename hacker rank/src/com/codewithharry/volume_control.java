package com.codewithharry;

import java.util.Scanner;

public class volume_control {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        if (t <= 100 && t >=1) {

            for (int i = 1; i <= t; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if ((1 <= x && x <= 100) && (1 <= y && y <= 100)) {

                    if (x > y && ((x & y) <= 100) && (1 <= (x & y))) {
                        System.out.println(x - y);
                    }
                    if (y > x && ((x & y) <= 100) && (1 <= (x & y))) {
                        System.out.println(y - x);
                    }
                    if (x == y) {
                        System.out.println("no need to do anything");
                    }
                }else System.out.println("nothing");
            }


        }else System.out.println("nothing");

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- >0){
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            System.out.println(Math.abs(x-y));
//        }

    }
}
