package com.codewithharry;

public class increasing_size_of_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,56,78,5,4,3,5};
        System.out.println(a.length);
        int b[]=new int [2*a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        a=b;

        System.out.println("Length of A="+a.length);


    }
}
