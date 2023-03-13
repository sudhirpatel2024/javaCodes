package com.codewithharry;


import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//class MyFrame2  extends Frame{
class MyFrame2  extends Frame implements ItemListener {
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup  cbg;          //radiobutton
    public MyFrame2(){
//        l=new Label("                                 ");
//        c1=new Checkbox("java");
//        c2=new Checkbox("python");
//        c3=new Checkbox("c#");

        super("check box demo");
        l=new Label("nothing is selected");

        cbg=new CheckboxGroup();

        c1=new Checkbox("java",false,cbg);
        c2=new Checkbox("python",false,cbg);
        c3=new Checkbox("c#",false,cbg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str="";
        if (c1.getState()){
            str=str+" "+c1.getLabel();
        }
        if (c2.getState()){
            str=str+" "+c2.getLabel();
        }
        if (c3.getState()){
            str=str+" "+c3.getLabel();
        }
        if (str.isEmpty()){
            str="nothing is selected";
        }

        l.setText(str);

    }
}

public class checkBoxRadioButton {
    public static void main(String args[]){
        MyFrame2 f=new MyFrame2();
        f.setSize(400,400);
        f.setVisible(true);

    }
}
