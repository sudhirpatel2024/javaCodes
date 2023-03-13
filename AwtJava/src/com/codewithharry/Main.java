package com.codewithharry;

import java.awt.*;

//class MyFrame extends Frame{
//    Label l;
//    TextField tf;
//    Button b;
//
//    public MyFrame(){
//        super("my app");          //2nd method
//
//        setLayout(new FlowLayout());
//
//        l=new Label("name");
//        tf=new TextField("20");
//        b=new Button("ok");
//
//        add(l);
//        add(tf);
//        add(b);
//    }
//}

public class Main extends Frame{
    Label l;
    TextField tf;
    Button b;

    public Main(){
        super("my app");

        setLayout(new FlowLayout());

        l=new Label("name");
        tf=new TextField("20");
        b=new Button("ok");

        add(l);
        add(tf);
        add(b);
    }

    public static void main(String[] args) {
	// write your code here
//        Frame f=new Frame("my first app");
//        f.setLayout(new FlowLayout());
//
//        Button b= new Button("ok");
//        Label l=new Label("name");
//        TextField tf=new TextField(20);          //  1st method
//        f.add(l);
//        f.add(tf);
//        f.add(b);
//        f.setSize(300,300);
//
//        f.setVisible(true);






//        MyFrame f=new MyFrame();
//        f.setSize(400,400);           // 2nd method
//        f.setVisible(true);



        Main f=new Main();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
