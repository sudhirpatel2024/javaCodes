package com.codewithharry;

import java.io.FileInputStream;

public class FileInputStreaANDFileReader {
    public static void main(String args[]) throws Exception{
        try (FileInputStream fis= new FileInputStream("c:/Sum/test.txt"))
        { int x;
            while ((x=fis.read())!=-1)
            {

                    System.out.print((char)x);
                }
            }

//            do {x=fis.read();
//                if (x!=-1)
//                System.out.print((char) x);    //2nd
//
//            }while (x!=-1);




//            byte b[]= new byte[fis.available()];
//          fis.read();
//          String  st=new String(b);     //1st
//            System.out.println(st);

        }





}
