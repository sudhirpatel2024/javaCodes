package com.codewithharry;

public class nestedTryCatch {
    public static void main(String args[]){
        try {
            int a[] = {10, 0, 8, 5, 3};
            try {
                int r=a[0]/a[1];
                System.out.println(r);
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            System.out.println(a[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
