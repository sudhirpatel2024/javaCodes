package com.codewithharry;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=0;i<T;i++) {
            int K = sc.nextInt();
            int X = sc.nextInt();
            int m = K*7;
            int Z = m - X;
            System.out.println(Z);
        }

        }

    }


