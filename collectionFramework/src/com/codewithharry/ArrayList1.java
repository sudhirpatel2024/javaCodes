package com.codewithharry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList <Integer>al1=new ArrayList<>(20);
        ArrayList <Integer>al2=new ArrayList<>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0,5);
//        al1.addAll(al2);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(4,55);


//        System.out.println(al1.contains(25));
//        System.out.println(al1.indexOf(70));


//        System.out.println(al1);


//        for (int i=0;i<al1.size(); i++){
//            System.out.println(al1.get(i));
//        }

//        for (Integer x:al1){
//            System.out.println(x);
//        }

//        al1.forEach((x)->{
//            System.out.println(x);
//        });

//        Iterator<Integer>it=al1.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        for (Iterator<Integer>it=al1.iterator();it.hasNext();)
//             {
//            System.out.println(it.next());
//        }

//        al1.forEach(n-> System.out.println(n));

//        al1.forEach(System.out::println);

        al1.forEach(m->show(m));


    }
    static void show(int m){
        if (m>60){
            System.out.println(m);
        }

    }
}
