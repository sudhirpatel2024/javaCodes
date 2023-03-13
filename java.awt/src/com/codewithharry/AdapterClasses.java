package com.codewithharry;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.PublicKey;

//class MyWindowAdapter extends WindowAdapter{
//    public void WindowClosing(WindowEvent we){
//        System.exit(0);
//    }
//}

class MyFrame6 extends Frame{

    public MyFrame6(){
        System.out.println("Adapter Demo");
//        addWindowListener(new MyWindowAdapter());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }
        });
    }
}



public class AdapterClasses {
    public static void main(String args[]){
        MyFrame6 f=new MyFrame6();
        f.setSize(500,500);
        f.setVisible(true);


    }
}
