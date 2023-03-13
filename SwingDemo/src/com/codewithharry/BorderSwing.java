package com.codewithharry;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class MyFrame3 extends JFrame{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;

    public MyFrame3(){
        l=new JLabel("name");
        tf=new JTextField(20);
        b=new JButton("ok");
        p=new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

//        Border br=BorderFactory.createLoweredBevelBorder();
//        Border br=BorderFactory.createRaisedBevelBorder();
//        Border br=BorderFactory.createEtchedBorder();
//        Border br=BorderFactory.createLineBorder(Color.blue,5  );
        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.blue),"Login");

        p.setBorder(br);


        setLayout(new FlowLayout());
        add(p);


    }
}

public class BorderSwing {
    public static void main(String agrs[]){
        MyFrame3 f=new MyFrame3();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
