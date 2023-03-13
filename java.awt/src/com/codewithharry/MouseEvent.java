package com.codewithharry;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class MyFrame3 extends Frame implements MouseListener, MouseMotionListener {
    Label l, l1;



    public MyFrame3(){
        super("Mouse Event Demo");
        l=new Label("");
        l1=new Label("");
        setLayout(null);
        l.setBounds(10,50,100,20);
        l1.setBounds(10,80,100,20);
        add(l);
        add(l1);
        addMouseListener(this);
        addMouseMotionListener(this);


    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        l.setText(" Mouse click");
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        l.setText(" Mouse pressed");
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        l.setText(" Mouse released");
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        l.setText(" Mouse Entered");
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        l.setText(" Mouse Exited");
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        l.setText(" Mouse dragged");
    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        l.setText(" Mouse Moved");
        l1.setText("("+e.getX()+","+e.getY()+")");
    }
}

public class MouseEvent {
    public static void main(String args[]){
        MyFrame3 f= new MyFrame3();
        f.setSize(500,500);
        f.setVisible(true);

    }
}
