package com.codewithharry;
class  cylender{
    private double radius;
    private double hight;

    public cylender(){
        radius=1;
        hight=1;
    }

    public cylender(double r,double h){
        radius=r;
        hight=h;
    }

    public double getHight() {
        return hight;
    }

    public double getRadius() {
        return radius;
    }

    public void setHight(double h){
        if (h>=0)
            hight=h;
        else
            hight=0;
    }

    public void setRadius(double r){
        if (r>=0)
           radius=r;
        else
            radius=0;
    }
    public double lidArea(){
        return Math.PI*radius*radius ;
    }

    public double volume(){
        return lidArea()*hight ;
    }

}

public class cylinder_constructor {
    public static void main(String args[]){
        cylender c=new cylender(4,5);
        System.out.println(c.getHight());
        System.out.println(c.getRadius());
        System.out.println(c.lidArea());
        System.out.println(c.volume());

    }
}
