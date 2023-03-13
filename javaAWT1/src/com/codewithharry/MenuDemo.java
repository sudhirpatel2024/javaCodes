package com.codewithharry;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

class MyFrame1 extends Frame{
    Menu file,sub;
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;
    TextField tf;

    public MyFrame1(){
        super("Menu demo");
        open=new MenuItem("open");
        save=new MenuItem("save");
        close=new MenuItem("close");
        closeall=new MenuItem("closeall");

        auto =new CheckboxMenuItem("auto save");

        file=new Menu("file");
        sub=new Menu("close");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeall);

        MenuBar mb=new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionListener) ->tf.setText("open"));
        save.addActionListener((ActionListener) ->tf.setText("save"));
        close.addActionListener((ActionListener) ->tf.setText("close"));
        closeall.addActionListener((ActionListener) ->tf.setText("closeall"));

        auto.addItemListener((ItemEvent)->{
            if (auto.getState())
                tf.setText("auto ob");
            else
                tf.setText("auto of");
        });




    }

}


public class MenuDemo {
    public static void main(String  args[]){
        MyFrame1 f=new MyFrame1();
        f.setSize(500,500);
        f.setVisible(true);

    }
}
