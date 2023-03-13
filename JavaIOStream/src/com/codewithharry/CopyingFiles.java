package com.codewithharry;
import java.io.*;

import java.io.FileInputStream;

public class CopyingFiles {
    public static void main(String args[]) throws Exception{
        FileInputStream fis1=new FileInputStream("c:/Sum/Source2.txt");
        FileInputStream fis2=new FileInputStream("c:/Sum/test.txt");

        FileOutputStream fos=new FileOutputStream("Destination.txt");

        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);


        int b;
        while((b=sis.read())!=-1)
        {

            fos.write(b);
        }

        sis.close();
        fis1.close();
        fis2.close();
        fos.close();


    }

    }

