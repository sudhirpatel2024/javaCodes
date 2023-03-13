package com.codewithharry;

public class methodMractice {
    static void change(int x[], int index, int value) {
        x[index] = value;
    }


    public static void main(String args[]) {


        int A[] = {2, 4, 5, 6, 7, 8};
        change(A, 4, 5);
        for (int x : A) {
            System.out.println(x);
        }
    }
}