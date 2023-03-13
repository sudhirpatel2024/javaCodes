package com.codewithharry;

import java.awt.*;

class MyFrame extends Frame{
    Button b1,b2,b3,b4,b5,b6;

    public MyFrame(){
        super("FlowLayoutDemo");
        b1=new Button("one");
        b2=new Button("two");
        b3=new Button("three");
        b4=new Button("four");
        b5=new Button("five");
        b6=new Button("six");

//        FlowLayout fl=new FlowLayout();
//        fl.setAlignment(FlowLayout.RIGHT);
//        fl.setHgap(100);
//        setLayout(fl);

//        add(b1);                //1st
//        add(b2);
//        add(b3);
//        add(b4);
//        add(b5);
//        add(b6);

        add(b1,BorderLayout.NORTH);
//        add(b2,BorderLayout.EAST);  //2nd
        add(b3,BorderLayout.WEST);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.CENTER);

        Panel p=new Panel();

        p.setLayout(new GridLayout(3,1));

        p.add(new Button("Mon"));

        p.add(new Button("tue"));
        p.add(new Button("wed"));
        add(p,BorderLayout.EAST);



    }
}

public class Main {

    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
	// write your code here
    }
}
