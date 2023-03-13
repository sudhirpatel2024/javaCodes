package com.codewithharry;
class circle{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

public class class_for_circle {
    public static void main(String[] args) {
        circle c1=new circle();
        circle c2=new circle();

        c1.radius=3;
        c2.radius=6;

        System.out.println("area:"+c1.area());
        System.out.println("perimeter"+c1.perimeter());
        System.out.println("circumference"+c1.circumference());
        System.out.println();
        System.out.println("area:"+c2.area());
        System.out.println("perimeter"+c2.perimeter());
        System.out.println("circumference"+c2.circumference());


    }
}
