package com.codewithharry;

public class overload_method_to_calculate_area {
        static double area(double x,double y){
        return x*y;
    }
    static double area(double r){
        return Math.PI*r*r;
    }
    public static void main(String args[]){

        //        System.out.println(area(4,5));

        System.out.println(area(4));

    }
}
