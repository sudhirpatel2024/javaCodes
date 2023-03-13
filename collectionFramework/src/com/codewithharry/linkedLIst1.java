package com.codewithharry;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedLIst1 {
    public static void main(String args[]) {
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        al1.add(10);
        al1.add(0, 5);
//        al1.addAll(al2);                           // also we can use everything from arraylist
        al1.addAll(1, al2);
        al1.add(5, 70);
        al1.set(4, 55);

        al1.addFirst(3);
        al1.addLast(4);

        al1.forEach(m -> show(m));

    }

    static void show(int m) {
//        if (m > 60)
            System.out.println(m);

    }
}
