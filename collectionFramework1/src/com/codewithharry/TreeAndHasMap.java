package com.codewithharry;
import java.util.*;
public class TreeAndHasMap {
    public static void main(String args[]){
//        TreeMap<Integer,String > tm= new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
//        tm.put(4,"E");
//        tm.put(5,"F");
//        Map.Entry<Integer,String > e=tm.firstEntry();
//

//        System.out.println(tm);
//        System.out.println(e.getKey()+" "+e.getValue());
//        System.out.println(tm.ceilingEntry(5).getValue());
//        System.out.println(tm.firstEntry());
//        System.out.println(tm.entrySet());
//        System.out.println(tm.size());
//        System.out.println(tm.values());


        HashMap<Integer,String > hm= new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));
        hm.put(4,"E");
        hm.put(5,"F");

        System.out.println(hm);


    }
}
