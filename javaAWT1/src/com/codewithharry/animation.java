package com.codewithharry;

import java.awt.*;

class MyFrame3 extends Frame implements Runnable{
    int x,y,tx,ty;


    public MyFrame3(){
        x=100;
        y=100;
        tx=ty=1;

         Thread t= new Thread(this);
         t.start();


    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x,y,50,50);

    }

    @Override
    public void run() {
        while (true){
            x+=tx;

            y+=ty;

            if (x<0 || x>450)
               tx=tx*-1;
            if (y<20 || y>350)
                ty=ty*-1;
            repaint();
            try {
                Thread.sleep(5);
            }catch (Exception e){}
        }

    }
}

public class animation {
    public static void main(String args[]){
        MyFrame3 f=new MyFrame3();
        f.setSize(500,400);
        f.setVisible(true);


    }
}
