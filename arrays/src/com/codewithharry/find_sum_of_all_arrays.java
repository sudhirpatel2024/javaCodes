package com.codewithharry;

public class find_sum_of_all_arrays {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        System.out.println(A.length);

        int sum=0;
        for (int i=0;i<10;i++){
            sum=sum+A[i];

        }
        System.out.println("sum is :"+sum);

    }
}
