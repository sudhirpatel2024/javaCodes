package com.codewithharry;
import java.util.*;
class My implements  Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        if (i1<12){
            return 1;
        }
        if (i1>i2){
            return -1;
        }
        return 0;
    }

}


public class ArrayAnsComparator {
    public static void main(String args[]){


//        int a[]={2,4,6,8,1,3};   //if a>b  it will return 1
//                                 // if  a<b it will return -1    it compares number by bnumber
//                                  // if a=b then it will return o
//        int b[]={2,4,6,8,1,3,5};
//
//        int c[]=Arrays.copyOf(a,7);
//        Arrays.fill(c,10);
//        for (int x:c){
//            System.out.println(x);
//        }
//        System.out.println(Arrays.compare(a,b));
//        System.out.println(Arrays.binarySearch(c,2));

        Integer a[]={2,3,4,5,6,7,8,3,2,4,2,9,8,7,5,4,4,8};
        Arrays.sort(a);

//       Arrays.sort(a, new My());

        for (Integer x:a){
            System.out.println(x);
        }

    }
}
