package com.codewithharry;
@FunctionalInterface
interface MyLambda1
{
    //public void display(String str);
    public int add(int x,int y);
}

public class parameterSInLamdaExpression {
    public static void main(String args[]){
        /*MyLambda1 m=(s)->{System.out.println(s);};
        m.display("Hello World");*/

        /*MyLambda1 m=(a,b)->{return a+b;};
        System.out.println(m.add(20,30));*/

        MyLambda1 m=(a,b)->a+b;
        int r=m.add(20, 30);
        System.out.println(r);
    }
}
