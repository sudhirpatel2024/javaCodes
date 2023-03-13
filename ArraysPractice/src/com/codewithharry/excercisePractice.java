package com.codewithharry;
import javax.swing.plaf.IconUIResource;
import java.io.*;
import java.util.*;

public class excercisePractice {

    public static void NameArray(){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        String name[]=new String[x];
        sc.nextLine();
        for (int i=0;i<x;i++) {
            name[i] = sc.nextLine();
        }
        for (int i=0;i< name.length;i++){
            System.out.println(name[i]);
        }
    }

    public static void FindMinMax(){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a[]=new int[x];
        for (int i=0;i<x;i++){
            a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i:a){
            if (i>max){
                max=i;
            }
            if (i<min){
                min=i;
            }
        }
        System.out.println("max is "+max);
        System.out.println("Min is "+min);

    }






    public static void main(String[] args) {

        //Take an array of names as input from the user and print them on the screen.
//          NameArray();

        //Find the maximum & minimum number in an array of integers
//         FindMinMax();


        //Take an array of numbers as input and check if it is an array sorted in ascending order.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
            if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
                isAscending = false;
            }
        }
        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }





    }
}
