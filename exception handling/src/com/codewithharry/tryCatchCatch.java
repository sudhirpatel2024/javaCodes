package com.codewithharry;

public class tryCatchCatch {
    public static void main(String args[]){
        try {
            int a[]={10,0,8,5,3};
            int r;
            r=a[0]/a[1];
            System.out.println(r);
            System.out.println(a[6]);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
