package com.codewithharry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count =0;


    public MyFrame(){
        super("Swing Demo");
        setLayout(new FlowLayout());
        l=new JLabel("clicked "+count+" Times");
        b=new JButton("click");

        add(l);
        add(b);

//        add(new JButton("cancel"));


        b.addActionListener(this);
        getRootPane().setDefaultButton(b);
        b.setIcon(new ImageIcon("\"E:\\vit memories\\bhi family\\bhi.jpeg\""));
        l.setToolTipText("counter");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("clicked "+count+" Times");

    }
}

public class Main {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
