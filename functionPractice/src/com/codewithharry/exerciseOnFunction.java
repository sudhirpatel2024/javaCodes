package com.codewithharry;

import java.util.Scanner;
import java.math.*;

public class exerciseOnFunction {

    public static void CalculateAverage(double x,double y,double z){
       double avg=(x+y+z)/3;
        System.out.println(avg);
    }

    public static void printSumOdd(int x){
        int sum=0;
        for (int i=1;i<=x;i++){
            if (i%2==1){
              sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    public static void checkGreater(int x,int y){
        if (x>y){
            System.out.println(x+" is a greater than "+y);
        }else if(x==y){
            System.out.println(x+" is a equal to "+y);
        }else System.out.println(x+" is a less than "+y);
    }

    public static void circumference(int r){
        double cir=2*(Math.PI)*r;
        System.out.println(cir);
    }

    public static void checkEligible(int x){
        if (x>18 && x<110){
            System.out.println("person is eligible for vote");
        }else if(x<18 && x>=0){
            System.out.println("person is not eligible for vote");
        }else System.out.println("invalid age");
    }

    public static void infiniteLoop(){
        int i=0;
        do {
            System.out.println("yes");
            i++;
        }
        while ( i>0);
    }

    public static void power(int x,int n){
        double power1=Math.pow(x,n);
        System.out.println(power1);
    }

    public static int gcd(int a,int b){
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }











    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);


//        double x=sc.nextDouble();
//        double y=sc.nextDouble();
//        double z=sc.nextDouble();
//        CalculateAverage(x,y,z);

//        printSumOdd(18);

//        checkGreater(4,3);

//        circumference(7);

//        int x=sc.nextInt();
//        checkEligible(x);

//        infiniteLoop();

//        power(2,10);

        System.out.println(gcd(12,18));













    }
}
