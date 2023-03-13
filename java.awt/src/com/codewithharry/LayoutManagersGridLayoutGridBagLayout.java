package com.codewithharry;

import java.awt.*;
import java.util.Scanner;

class MyFrame1 extends Frame {
    Button b1, b2, b3, b4, b5, b6;

    public MyFrame1() {
//        super("GridLayoutDemo");
//        setLayout(new GridLayout(3,3));
        super("GridBagLayoutDemo");
        GridBagLayout gb=new GridBagLayout();
        GridBagConstraints gdc=new GridBagConstraints();
        setLayout(gb);

        b1 = new Button("one");
        b2 = new Button("two");
        b3 = new Button("three");
        b4 = new Button("four");
        b5 = new Button("five");
        b6 = new Button("six");

        gdc.gridx=1;
        gdc.gridy=1;
        add(b1,gdc);

        gdc.gridx=2;
        gdc.gridy=2;
        add(b2,gdc);

        gdc.gridx=3;
        gdc.gridy=3;
        add(b3,gdc);


        gdc.gridx=4;
        gdc.gridy=4;
        add(b4,gdc);


        gdc.gridx=5;
        gdc.gridy=5;
        add(b5,gdc);


        gdc.gridx=6;
        gdc.gridy=6;
        add(b6,gdc);


//        add(b1);
//        add(b2);
//        add(b3);
//        add(b4);
//        add(b5);
//        add(b6);
//        add(new Button("seven"));
    }
}


public class LayoutManagersGridLayoutGridBagLayout {
    public static void main(String args[]){
        MyFrame1 f= new MyFrame1();
        f.setSize(500,500);
        f.setVisible(true);




    }
}
