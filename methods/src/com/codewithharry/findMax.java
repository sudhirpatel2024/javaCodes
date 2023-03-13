package com.codewithharry;

public class findMax {
    static int Max(int x, int y){
        if (x>y){
            return x;
        }else return y;
    }
    public static void main(String args[]){
        int x=1;
        int y=4;
        int c;
        c= Max(x,y);
        System.out.println(c);

    }
}

