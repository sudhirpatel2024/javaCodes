package com.codewithharry;
import java.util.*;

public class stringBuilder {

    public static void reverseString(){
        StringBuilder str=new StringBuilder("hello");

        for (int i=0;i<str.length()/2;i++){
            int front=i;
            int back=str.length()-i-1;
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);


            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);
    }

    public static void main(String args[]){




    }
}
