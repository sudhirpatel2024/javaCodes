package com.codewithharry;
import java.io.FileInputStream;
import java.util.*;
public class StringTokenizer1 {
    public static void main(String args[])throws Exception{
        FileInputStream fis=new FileInputStream("c:/Sum/Data.txt");
        byte b[]=new byte[fis.available()];
        String data=new String();



//        String data="name=vijay address=deli country=india dept=cse";
//        StringTokenizer stk=new StringTokenizer(data,"= ");


        StringTokenizer stk=new StringTokenizer(data,",");
        String s;
        ArrayList<Integer>al=new ArrayList<>();
        while (stk.hasMoreElements()){
            s=stk.nextToken();al.add(Integer.valueOf(s));
            System.out.println(al);
        }

    }
}
