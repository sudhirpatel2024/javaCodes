package com.codewithharry;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();


        //Rectangle of *

//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Hollow rectangle *

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=m;j++){
//                if(i==1 || j==1 || i==n || j==m  ){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            } System.out.println();
//        }

        // Half Pyramid *

//        for (int i=1;i<=n;i++){
//          for (int j=1;j<=i;j++){
//              System.out.print("*");
//          }
//            System.out.println();
//        }

        //inverted half pyramid

//        for (int i=1;i<=n;i++){
//           for (int j=1;j<=n+1-i;j++) {
//               System.out.print("*");
//           }
//            System.out.println();
//        }

//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Inverted half

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // half Pyramid with number

//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //inverted half pyramid with number

//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n+1-i;j++) {
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }

        //floyd's triangle
//        int num=1;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }

        // 0-1 triangle

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                if ((i%2==1 && j%2==1 )|| (j%2==0 && i%2==0)){
//                    System.out.print("1"+" ");
//                }else
//                    System.out.print("0"+" ");
//            }
//            System.out.println();
//        }

        //  inverted Solid rhombus

//        for (int i=1;i<=n;i++){
//
//                for (int j = n; j > n-i+1; j--) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= n; j++) {
//                    System.out.print("*");
//                }
//               for (int j = 1; j <=n-i+1; j++) {
//                System.out.print(" ");
//               }
//
//            System.out.println();
//        }

        // solid rhombus

//        for (int i=1;i<=n;i++){
//            for (int j = 1; j <=n-i+1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n; j++) {
//                System.out.print("*");
//            }
//            for (int j = n; j > n-i+1; j--) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        //mixed solid rhombus

//        for (int i=1;i<=n;i++){
//
//            for (int j = n; j > n-i+1; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n; j++) {
//                System.out.print("*");
//            }
//            for (int j = 1; j <=n-i+1; j++) {
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }
//
//        for (int i=1;i<=n;i++){
//            for (int j = 1; j <=n-i+1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n; j++) {
//                System.out.print("*");
//            }
//            for (int j = n; j > n-i+1; j--) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        //print butterfly
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            for (int j=n-i;j>=1;j--){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=n-i;j>=1;j--){
//                System.out.print("  ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //number pyramid

//        for (int i=1;i<=n;i++){
//            for (int j=n-i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        //palindromic pattern

//        for (int i=1;i<=n;i++){
//            for (int j=n-i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            for (int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

         // diamond pattern
//        for (int i=1;i<=n;i++){
//            for (int j=n-i;j>=1;j--){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            for (int j=2;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i=n;i>=1;i--){
//            for (int j=n-i;j>=1;j--){
//                System.out.print("  ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print("* ");
//            }
//            for (int j=i;j>=2;j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // hollow butterfly

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                if (j==1 || j==i){
//                    System.out.print("*");
//                }else
//                    System.out.print(" ");
//            }
//            for (int j=n-i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
////            for (int j=1;j<=i;j++){
//////                System.out.print("*");
////                if (j==i ){
////                    System.out.print("*");
////                }else
////                    System.out.print(" ");
////            }
//            System.out.println();
//        }

        //        for (int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                if (j==1 || j==i){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=n-i;j>=1;j--){
//                System.out.print(" ");
//            }
////            for (int j=i;j>=1;j--){
//////                System.out.print("*");
////                if (j==i ){
////                    System.out.print("*");
////                }else
////                    System.out.print(" ");
////            }
//            System.out.println();
//        }

      //Alphabets pattern

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            char c='A';
//            int bp=(2*i+1)/2;
//            for(int j=1;j<=2*i+1;j++){
//                System.out.print(c);
//                if (j<=bp) c++;
//                else c--;
//            }
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//
//           System.out.println();
//        }


//        for(int i=n;i>=1;i--){
//            for(int j=n;j>=i;j--){
//                System.out.print((char) ('A'+j-1)+" ");
//            }System.out.println();
//        }



//      for(int i=1;i<=n;i++){
//          for(int j=n-i+1;j>=1;j--){
//              System.out.print("*");
//          }
//          for(int j=2;j<=i;j++){
//              System.out.print(" ");
//          }
//          for(int j=2;j<=i;j++){
//              System.out.print(" ");
//          }
//          for(int j=n-i+1;j>=1;j--){
//              System.out.print("*");
//          }
//          System.out.println();
//      }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//
//
//            System.out.println();
//        }

//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for (int j=n-i+1;j>1;j--){
//                System.out.print(" ");
//            }
//            for (int j=n-i+1;j>1;j--){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=n-1;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for (int j=n-i+1;j>1;j--){
//                System.out.print(" ");
//            }
//            for (int j=n-i+1;j>1;j--){
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//         for (int i=1;i<=n;i++){
//             for (int j=1;j<=n;j++){
//                 if (i==1 || j==1 ||i==n||j==n){
//                     System.out.print("*");
//                 }else System.out.print(" ");
//             }
//             System.out.println();
//         }

        //Bit manipulation

        int n=sc.nextInt();
        





















































    }
}
