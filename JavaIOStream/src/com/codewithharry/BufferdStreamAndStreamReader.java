package com.codewithharry;
import java.io.*;


public class BufferdStreamAndStreamReader {
    public static void main(String args[]) throws Exception{
        FileInputStream fis=new FileInputStream("c:/Sum/test.txt");
        BufferedInputStream bis1=new BufferedInputStream(fis);
//        System.out.println(bis1.read());
//        System.out.println(bis1.read());
//        bis1.mark(10);
//        System.out.println(bis1.read());
//        System.out.println(bis1.read());
//        bis1.reset();
//        System.out.println(bis1.read());
//        System.out.println(bis1.read());

        System.out.println((char) bis1.read());
        System.out.println((char)bis1.read());
        bis1.mark(10);
        System.out.println((char)bis1.read());
        System.out.println((char)bis1.read());
        bis1.reset();
        System.out.println((char)bis1.read());
        System.out.println((char)bis1.read());
       // System.out.println("String "+bis1.readLine());   doubtful



//        System.out.println("file "+fis.markSupported());   //2nd
//        System.out.println("buffer "+bis1.markSupported());

//        int x;
//        while ((x= bis1.read())!=-1){
//            System.out.println((char) x);   //1st
//        }

    }
}
