package com.codewithharry;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Scanner;

//class MyFrame extends Frame implements ActionListener {  // 1st
class MyFrame extends Frame {
    TextField tf;
    Button b;
    int count = 0;

    public MyFrame() {
        super("Event Demo");
        tf = new TextField("0", 20);
        b = new Button("Click");

        setLayout(new FlowLayout());

        add(tf);
        add(b);

//        b.addActionListener(this);        //1st
//        b.addActionListener(new MyListener());  //2nd

        b.addActionListener((ActionEvent e)->
           {
               count++;
                 tf.setText(String.valueOf(count));
            }
        );

//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {     //3rd
//                count++;
//                tf.setText(String.valueOf(count));
//            }
//        });


    }
}

//    class MyListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {    //2nd
//            count++;
//            tf.setText(String.valueOf(count));
//        }
//
//    }


//    @Override
//    public void actionPerformed(ActionEvent e) {   //1st
//        count++;
//        tf.setText(String.valueOf(count));
//    }
//}
public class Main {

    public static void main(String[] args) {

        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);




    }
}

