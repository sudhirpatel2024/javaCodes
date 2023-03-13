package com.codewithharry;

import org.w3c.dom.events.MouseEvent;
import java.lang.Integer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

class MyFrame5 extends JFrame implements ActionListener {
    JLabel l1,l2,l3, l4;
    JRadioButton r1,r2,r3;
    JLayeredPane lp;

    MyFrame5(){

        super("Layered Demo");
        r1=new JRadioButton("red");
        r2=new JRadioButton("green");
        r3=new JRadioButton("blue",true);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        JPanel p1=new JPanel();
        p1.add(r1);
        p1.add(r2);
        p1.add(r3);

        l1=new JLabel("Red");
        l1.setBounds(10,10,200,200);
        l1.setBackground(Color.RED);
        l1.setOpaque(true);

        l2=new JLabel("Green");
        l2.setBounds(50,50,250,250);
        l2.setBackground(Color.green);
        l2.setOpaque(true);

        l3=new JLabel("Blue");
        l3.setBounds(70,70,300,300);
        l3.setBackground(Color.blue);
        l3.setOpaque(true);

        l4=new JLabel("black");
        l4.setBounds(100,100,150,150);
        l4.setBackground(Color.black);
        l4.setOpaque(true);

        lp=new JLayeredPane();
        lp.add(l1,new Integer(0));
        lp.add(l2,new Integer(1));
        lp.add(l3,new Integer(2));

        lp.add(l4,new Integer(3));

        add(p1,BorderLayout.NORTH);
        add(lp,BorderLayout.CENTER);

        addMouseMotionListener(new MouseAdapter(){               // doubt

        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected())
            lp.setLayer(l4,1);
        if (r2.isSelected())
            lp.setLayer(l4,2);
        if (r3.isSelected())
            lp.setLayer(l4,3);

    }
}

public class LayeredPane {
    public static void main(String args[]){
        MyFrame5 f=new MyFrame5();
        f.setSize(800,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
