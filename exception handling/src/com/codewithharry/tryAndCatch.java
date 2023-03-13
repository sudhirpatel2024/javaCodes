package com.codewithharry;

public class tryAndCatch {
    public static void main(String args []){
        int a ,b,c;
        try {

            a=10;
            b=0;
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("bye");


    }
}
