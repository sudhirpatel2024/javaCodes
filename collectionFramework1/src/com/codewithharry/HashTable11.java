package com.codewithharry;
import java.util.*;
public class HashTable11 {
    public static void main(String args[]){
//       Hashtable ht=new Hashtable();
//       ht.put(1,"A");
//       ht.put(2,"B");
//       ht.put(3,"C");
//       ht.put(4,"D");
//       ht.put(5,"E");
//       ht.put(6,"F");
//       String  s=(String) ht.get(3);
//
//       Enumeration e=ht.elements();
//       Enumeration f=ht.keys();
//
//       while (e.hasMoreElements()){
//           System.out.println(f.nextElement());
//           System.out.println(e.nextElement());
//       }

        Hashtable<Integer,String > ht=new Hashtable<>();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");
        ht.put(6,"F");
//        ht.compute(2,(k,v)->v+"z");
        ht.computeIfAbsent(7,(k)->"Z"+k);
        System.out.println(ht);


    }
}
