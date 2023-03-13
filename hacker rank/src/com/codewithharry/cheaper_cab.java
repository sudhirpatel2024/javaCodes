package com.codewithharry;

import java.util.Scanner;

public class cheaper_cab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int testCase=sc.nextInt();
        for (int i=1;i<=testCase;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if (x<y){
                System.out.println("first");
            }
            if (x==y){
                System.out.println("any");
            }
            if (x>y){
                System.out.println("second");
            }
        }
    }

}
