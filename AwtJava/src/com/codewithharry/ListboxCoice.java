package com.codewithharry;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame5 extends Frame  implements ItemListener , ActionListener {
    List l;
    Choice c;
    TextArea ta;

    public MyFrame5 (){
        super("ListBox and Choice");
        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(20,30);

        l.add("monday");
        l.add("tuesday");
        l.add("wednesday");
        l.add("thursday");
        l.add("friday");
        l.add("saturday");
        l.add("sunday");

        c.add("january");
        c.add("february");
        c.add("march");
        c.add("april");
        c.add("may");
        c.add("june");
        c.add("july");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
if (e.getSource()==l)
ta.setText(l.getSelectedItem());
else
    ta.setText(c.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String list[]=l.getSelectedItems();
        String txt="";
        for (String x:list){
            txt+=x+"\n";
            ta.setText(txt);
        }


    }
}

public class ListboxCoice {
    public static void main(String args[]){
        MyFrame5 f=new MyFrame5();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
