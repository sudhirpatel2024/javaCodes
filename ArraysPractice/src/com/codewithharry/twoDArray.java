package com.codewithharry;

import java.util.Scanner;

public class twoDArray {
    public static void findIndex(){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();

        int a[][]=new int[r][c];

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){

                if (x==a[i][j]){
                    System.out.println((i+1)+","+(j+1));
                    break;
                }
            }
        }
    }

    public static void main(String args[]){

       findIndex();


    }
}
