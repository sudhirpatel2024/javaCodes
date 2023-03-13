package com.codewithharry;

public class method_Overloading
{
    static  int max(int x,int y)
    {
        return x>y ? x:y;
    }
    static  float max(float x,float y)
    {
        return x>y ? x:y;
    }
//    static int max(int x,int y, int z){
//        return x>y && x>z ? x:(y>z ? y:z);

//    }

     static int max(int a, int b, int c)    // both are same
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
    public static void main(String args[])
    {
        System.out.println(max(10,5,38));

    }
}
