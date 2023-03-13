package com.codewithharry;
import java.io.*;


public class FileClass {
    public static void main(String ags[]) throws Exception{
        File f=new File("c:\\Sum\\Data.txt");
//        f.setReadOnly();
//        f.setWritable(true);
        f.setLastModified(10);
        FileOutputStream fos=new FileOutputStream("c:\\Sum\\Data.txt");





//        System.out.println(f.isDirectory());  //3rd

//        File list[]=f.listFiles();
//        for (File x:list){
//            //System.out.println(x);
//            System.out.print(x.getName()+ ":  ");        //2nd
//            System.out.println(x.getPath());
//        }



//         String list[]= f.list();
//         for (String x:list){            //1st
//             System.out.println(x);
//         }

    }
}
