package com.codewithharry;
import java.io.*;
class Student{
    int rollno;
    String name;
    String dept;

}


public class PrintStream
{


    public static void main(String args[]) throws Exception
    {
        FileOutputStream fo =new FileOutputStream("c:\\Sum\\Student1");
        PrintStream ps=new PrintStream();    //doubtful
        Student s=new Student();
        s.rollno=10;
        s.name="john";
        s.dept="bdc";




    }
}
