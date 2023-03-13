package com.codewithharry;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends Frame implements ActionListener {
    int count =0;
    Label l;
    Button b;


    public MyFrame1(){
        super("Button Demo");
        l=new Label(" "+count);
        b=new Button("click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       count++;
       l.setText(" "+count);
    }
}

public class ActionListenerJava {
    public static void main(String args[]){

        MyFrame1 f=new MyFrame1();
        f.setSize(400,400);
        f.setVisible(true);


    }
}
