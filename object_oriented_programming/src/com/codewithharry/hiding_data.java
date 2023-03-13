package com.codewithharry;
class Ractangle{
    private double length;
    private double bredth;

    public double getBredth() {
        return bredth;
    }
    public double getLength(){
        return length;
    }

    public void setBredth(double b) {
        if (b>=0)
            bredth=b;
        else bredth=0;
    }
    public void setLength(double l){
        if (l>=0)
            length=l;
        else length=0;
    }
    public double area(){
        return getBredth()*getLength(); // we can use this also
    }
    public double perimeter(){
        return 2*(length+bredth);
    }
    public boolean isSquare(){
        if (length==bredth)
            return true;
        else return false;
    }

}
public class hiding_data {
    public static void main(String args[]){
        Ractangle r=new Ractangle();
        r.setBredth(12);
        r.setLength(12);

        System.out.println(r.getBredth());
        System.out.println(r.getLength());
        System.out.println("is square :"+r.isSquare());


        System.out.println("area : "+r.area());
        System.out.println("perimeter : "+r.perimeter());




    }
}

