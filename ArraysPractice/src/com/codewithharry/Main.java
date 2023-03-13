package com.codewithharry;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int[x];
        for (int i=0;i<x;i++) {
            a[i]=sc.nextInt();
        }
        int y=sc.nextInt();
        for (int i=0;i<x;i++){
            if(y==a[i]){
                System.out.println("value found at index "+i);
                break;
            }else {
                System.out.println("not found");
                break;
            }
        }





    }
}
