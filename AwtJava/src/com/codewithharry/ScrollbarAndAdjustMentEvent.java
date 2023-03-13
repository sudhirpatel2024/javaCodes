package com.codewithharry;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class MyFrame6 extends Frame implements AdjustmentListener {
    Scrollbar red,green,blue;
    TextField tf;


    public MyFrame6(){
        super("Scrollbar demo");
        red= new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue= new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green= new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);

        tf=new TextField(20);

        tf.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        green.setBounds(50,200,300,30);
        blue.setBounds(50,250,2300,30);

        setLayout(null);
        add(tf);
        add(red);
        add(blue);
        add(green);

        red.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
        green.addAdjustmentListener(this);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));

    }
}

public class ScrollbarAndAdjustMentEvent {
    public static void main(String args[]){
        MyFrame6 f=new MyFrame6();
        f.setSize(500,500);
        f.setVisible(true);

    }
}
