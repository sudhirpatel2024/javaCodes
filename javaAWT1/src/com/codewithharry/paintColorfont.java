package com.codewithharry;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyFrame2 extends Frame{
    int x=0,y=0;

    public MyFrame2 (){
        super("Painting");
//        addMouseListener(new MouseAdapter() {
        addMouseMotionListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent me)
        public void mouseMoved(MouseEvent me)
            {
                x=me.getX();
                y=me.getX();
                repaint();

            }
        });
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
//        g.drawOval(x,y,50,50);
//        g.fillOval(x,y,50,50);
        g.setFont(new Font("NoteWorthy",Font.BOLD,30));
        g.drawString("hello",x,y);
    }

}

public class paintColorfont {
    public static void main(String args[]){
        MyFrame2 f=new MyFrame2();
        f.setSize(500,500);
        f.setVisible(true);

    }
}
