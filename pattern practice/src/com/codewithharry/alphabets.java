package com.codewithharry;

import java.util.Scanner;

public class alphabets {
    public static void printN(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j==1 || j==n || i==j){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printC(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++) {
               if (i==1 || j==1 || i==n){
                   System.out.print("* ");
               }else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printO(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }else {
                System.out.print("  ");}

            }
            System.out.println();
        }
    }

    public static void printD(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");}

            }
            System.out.println();
        }
    }

    public static void printZ(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || i==n || j==n-i+1  ){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void printE(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j==1 || i==1 || i==n ||i==(n/2)+1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void printF(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j==1 || i==1 ||i==(n/2)+1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printB(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j==1 || i==1 || i==n || j==n ||i==(n/2)+1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printH(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (j==1   || j==n ||i==(n/2)+1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printI(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( i==1 || i==n ||j==(n/2)+1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void printL(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( j==1 || i==n ){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printT(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( i==1 || j==n/2+1 ){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printJ(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( i==1 || j==n/2+1 ||(j<=n/2 && i==n ) ){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void print8(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( i==1 || i==n || (i==j && i<=n/2+1 && j<=n/2+1) || (i==j | j==n-i+1) )  {
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printP(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( i==1 || i==n/2+1 || j==1 || (j==n & i<n/2+1) ){

                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printR(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( i==1 || i==n/2+1 || j==1 || (j==n & i<n/2+1) || (i>n/2 & j==n-n/2 )){

                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printS(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( i==1 || i==n  || i==n/2+1 || (j==1 && i<=n/2) || (j==n && i>n/2)){

                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void printU(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( j==1 || j==n || i==n){

                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }












    public static void main(String args[]){

        printB();
        printC();
        printD();
        printE();
        printF();
        printH();
        printI();
        printJ();

        printL();
        print8();
        printN();
        printO(); // this is d too
        printP();
        printR();
        printS();
        printT();
        printU();

        printZ();







    }
}
