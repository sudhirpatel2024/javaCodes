package com.codewithharry;
class rectangle{
    public int length;
    public int hight;
    public int area(){
        return length*hight;
    }
    public int perimeter(){
        return 2*(length+hight);
    }
    public boolean isSquare(){

//        if (length==hight)return true;   // we can right in both way
//        return false;

        if (length==hight)
            return true;
        else
        return false;
    }
}
public class class_for_rectangle {
    public static void main(String args[]){
        rectangle r1=new rectangle();
        r1.hight=4;
        r1.length=5;
        System.out.println("area "+r1.area());
        System.out.println("perimeter"+r1.perimeter());
        System.out.println(r1.isSquare());


    }
}
