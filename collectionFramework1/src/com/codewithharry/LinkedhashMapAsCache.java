package com.codewithharry;
import java.util.*;
public class LinkedhashMapAsCache {
    public static void main(String args[]){
//        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5);
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,0.75f,true)
        {
            protected boolean removeEldestEntry(Map.Entry e)
            {
            return size()>5;
            }
        };

        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        lhm.put(6,"f");
        String s=lhm.get(2);
        s=lhm.get(5);
        s=lhm.get(1);
        System.out.println();
//        System.out.println(lhm);

        lhm.forEach((k,v)->System.out.println(k+" "+v));




    }

}
