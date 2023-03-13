package com.codewithharry;
class cylinder{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*radius*radius ;
    }
    public double totalArea(){
        return 2*lidArea()+circumference()*height;

    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return lidArea()*height ;
    }

}

public class class_for_cylinder {
    public static void main(String args[]){
        cylinder c=new cylinder();
        c.height=3;
        c.radius=2;
        System.out.println(c.lidArea());
        System.out.println(c.circumference());
        System.out.println(c.volume());
        System.out.println(c.totalArea());

    }
}
