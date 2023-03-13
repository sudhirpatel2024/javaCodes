package com.codewithharry;
interface test{
    void meth1();
    void meth2();

}
class my implements test{
    public void meth1(){
        System.out.println("ram");
    }
    public void meth2(){
        System.out.println("rahim");
    }
    public void meth3(){
        System.out.println("raja ram");
    }
}

public class interface_rodemap {
    public static void main(String args[]){
        test t=new my();
        t.meth1();
        t.meth2();
       // t.meth3();  // not allowed
    }
}
