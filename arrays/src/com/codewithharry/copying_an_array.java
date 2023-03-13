package com.codewithharry;

public class copying_an_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,56,78,5,4,3,5};
        int b[]=new int [10];
        for (int x:a)
            System.out.print(x+";");

        for (int i=0;i<a.length;i++){

            b[i]=a[i];
        }
        System.out.println();
        for (int x:b)
            System.out.print(x+";");

    }
}
