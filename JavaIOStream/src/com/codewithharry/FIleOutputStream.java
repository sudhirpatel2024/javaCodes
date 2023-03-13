package com.codewithharry;
import java.io.*;

public class FIleOutputStream {
    public FIleOutputStream(String s) {
    }

    public static void main(String args[]) throws Exception
    {
        try {
            FileOutputStream fos=new FileOutputStream("c:/Sum/test.txt");

            String str="learn java programming";
            byte b[]=str.getBytes();
            fos.write(b,6,str.length()-6);
//            for (byte x:b){
//                fos.write(x);   //2nd
//            }

//            fos.write(b);  //1st
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }



    }
}
