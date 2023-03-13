package com.codewithharry;
import java.lang.annotation.*;

//@Retention(RetentionPolicy.Class)
//@Documented
//@Target(value=ElementType.LOCAL_VARIABLE,ElementType.METHOD)
//Repeatable(MyAnno.class)

@interface JavaCod
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

//@MyAnno(name="Ajay",project="Bank")


public class javaCode {

    int data;
    //@MyAnno(name="Ajay",project="Bank")


    //@MyAnno(name="Ajay")
    public static void main(String args[]){
        //@MyAnno(name="Ajay")
        int x;

    }
}
