package com.codewithharry;
import java.util.*;
public class LinkedHasSet {
    public static void main(String args[]){
//        LinkedHashSet<String >  lhs=new LinkedHashSet<>(10);
        HashSet<String >  lhs=new HashSet<>(10);
        lhs.add("A");
        lhs.add("M");
        lhs.add("K");
        lhs.add("K");
        lhs.add("E");
        lhs.add("P");
//        lhs.forEach(System.out::println);

        Iterator<String >itr=lhs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
