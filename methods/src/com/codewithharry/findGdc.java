package com.codewithharry;

public class findGdc {
//    static int findGDC(int x,int y){
//        while (x!=y){
//            if (x>y)x=x-y;
//            else y=y-x;
//        }return x;
//
//    }


    // for three numbers

    static int findGDC(int x,int y,int z){
        while (   (x!=y)&&(y!=z) ){
            if (y>z)y=y-z;
            else if (z>y)z=z-y;
            else if (x>y)x=x-y;

            else  y=y-x;

        }return y;



    }
    public static void main(String args[]){
        System.out.println(findGDC(36,54 ,90));

    }
}
