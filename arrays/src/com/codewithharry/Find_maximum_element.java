package com.codewithharry;

public class Find_maximum_element {
    public static void main(String[] args) {


//        int A[]={3,9,7,8,12,90,30,5,4,10};
//        System.out.println(A.length);
//        int max=A[0];
//        for (int i=0;i<10;i++){
//            if (A[i]>max){
//                max=A[i];
//            }
//
//        }
//        System.out.println(max);


        int A[]={9,3,7,8,12,6,30,5,4,10};
        System.out.println(A.length);
        int min=A[0];
        for (int i=0;i<10;i++){
            if (A[i]<min){
                min=A[i];
            }

        }
        System.out.println(min);


    }
}
