package com.codewithharry;

import java.awt.*;
import java.awt.event.WindowListener;

class MyFrame4 extends Frame implements WindowListener {
    Label l;

    public MyFrame4(){
        super("window Event Demo");
      l=new Label("               ");

      setLayout(new FlowLayout());
      add(l);
    }

    @Override
    public void windowOpened(java.awt.event.WindowEvent e) {
        l.setText("Window  Opened");
        System.exit(0);

    }

    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {
        l.setText("Window  closing");

    }

    @Override
    public void windowClosed(java.awt.event.WindowEvent e) {
        l.setText("Window  closed");

    }

    @Override
    public void windowIconified(java.awt.event.WindowEvent e) {
        l.setText("Window  Iconified");
    }

    @Override
    public void windowDeiconified(java.awt.event.WindowEvent e) {
        l.setText("Window  ");
        l.setText("Window  DeIconified");
    }

    @Override
    public void windowActivated(java.awt.event.WindowEvent e) {
        l.setText("Window  Activated");
    }

    @Override
    public void windowDeactivated(java.awt.event.WindowEvent e) {
        l.setText("Window  DeActivated");
    }
}

public class WindowEvent {
    public static void main(String args[]){
        MyFrame4 f=new MyFrame4();
        f.setSize(500,500);
        f.setVisible(true);


    }
}
