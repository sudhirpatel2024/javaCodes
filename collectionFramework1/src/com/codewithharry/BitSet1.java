package com.codewithharry;
import java.util.*;
public class BitSet1 {
    public static void main(String args[]){
        BitSet bs1=new BitSet();
        bs1.set(0);
//        bs1.set(1);
        bs1.set(2);
        bs1.set(4);
//        bs1.set(5);

        BitSet bs2=new BitSet();
//        bs2.set(0);
        bs2.set(1);
//        bs2.set(2);
        bs2.set(3);
  //      bs2.set(4);
        bs2.set(5);

//        bs1.and(bs2);
//        System.out.println(bs1);
//        bs2.and(bs1);
//        System.out.println(bs2);
//
        bs1.or(bs2);
        System.out.println(bs2);
        bs2.or(bs1);
        System.out.println(bs2);

//        System.out.println(bs1.get(9));

//        bs1.flip(0,bs1.length());
//        System.out.println(bs1);



    }
}
