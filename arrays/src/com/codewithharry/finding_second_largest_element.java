package com.codewithharry;

public class finding_second_largest_element {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,30,5,4,10};
        System.out.println(A.length);
        int max1=0;
        int max2=0;
        for (int i=0;i<10;i++) {
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if (A[i] > max2) {
                max2 = A[i];

            }
        }
        System.out.println("second largest element"+max2);

    }
}
