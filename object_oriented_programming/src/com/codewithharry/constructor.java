package com.codewithharry;
class rangle{

    private double length;
    private double bredth;
    public rangle(){
        length=1;
        bredth=1;
    }
    public rangle(double l,double b){
        length=l;
        bredth=b;
    }
    public rangle(double s){
        length=bredth=s;
    }
    public void setBredth(double b) {
        if (b>=0)
            bredth=b;
        else bredth=0;
    }
    public double getBredth() {
        return bredth;
    }
    public double getLength(){
        return length;
    }

    public void setLength(double l){
        if (l>=0)
            length=l;
        else length=0;
    }
    public double perimeter(){
        return 2*(length+bredth);
    }
    public double area(){
        return getBredth()*getLength(); // we can use this also
    }
    public boolean isSquare(){
        if (length==bredth)
            return true;
        else return false;
    }


}

public class constructor {
    public static  void main (String args[]){
        rangle r=new rangle(10,15);
        System.out.println("area : "+r.area());
        System.out.println("perimeter : "+r.perimeter());



    }
}
