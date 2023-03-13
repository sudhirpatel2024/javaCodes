package com.codewithharry;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;

class MyFrame4 extends JFrame implements TreeSelectionListener {
    JTree tree;
    JLabel l;

    MyFrame4 (){
        super("Tree demo ");
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("c:\\MyJava");
        File f=new File("c:/MyJava");

        for(File x: f.listFiles())
        {
            if (x.isDirectory())
             {
                 for (File y:x.listFiles()) {
                     root.add(new DefaultMutableTreeNode(x.getName()));
                 }
                 DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());

             }
            else {
                root.add(new DefaultMutableTreeNode(x.getName()));



                }
            }



        tree =new JTree(root);
        l=new JLabel("No files Selected");

        tree.addTreeSelectionListener(this);
        JScrollPane sp=new JScrollPane();
//        add(sp, BorderLayout.CENTER);

        add(tree, BorderLayout.CENTER);
        add(l,BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
       l.setText( e.getPath().toString());
    }
}

public class JTREE {
    public static void main(String  args[]){
        MyFrame4 f=new MyFrame4();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
