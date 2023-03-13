package com.codewithharry;
import com.sun.jdi.request.StepRequest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
public class properties {
    public static void main(String args[]) throws Exception{
        Properties p= new Properties();
//        p.setProperty("brand","dell");
//        p.setProperty("processor","i3");
//        p.setProperty("os","window");
//        p.setProperty("model","Latitude");
////        System.out.println(p);
////        p.store(new FileOutputStream("c:/Sum/Data.txt"),"laptop");
//        p.storeToXML(new FileOutputStream("c:/Sum/Data.xml"),"laptop");
////        p.store(new FileOutputStream("c:/Sum/Data.txt"),"laptop");

        p.loadFromXML(new FileInputStream("c:/Sum/Data.xml"));
        System.out.println(p);
        System.out.println(p.getProperty("state"));



    }
}
