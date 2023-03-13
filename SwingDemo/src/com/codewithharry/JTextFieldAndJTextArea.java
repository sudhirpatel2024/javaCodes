package com.codewithharry;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

class MyFrame1 extends JFrame{


    public MyFrame1(){
        JTextField tf1=new JTextField(15);

        DateFormat df=new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField tf2=new JFormattedTextField(df);

        tf2.setColumns(15);
        tf2.setValue(0);

//        NumberFormat nf=NumberFormat.getInstance();
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft=new NumberFormatter(nf) ;
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        JFormattedTextField tf3=new JFormattedTextField(nft);
        tf3.setColumns(15);
        tf3.setValue(0);

        JTextArea ta=new JTextArea(30,30);
        ta.setText("raju");

        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);


    }
}

public class JTextFieldAndJTextArea {
    public static void main(String args[]){
        MyFrame1 f=new MyFrame1();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
