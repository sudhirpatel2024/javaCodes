package com.codewithharry;

public class runnableClass1 implements Runnable{
    public void  run(){
        int i=1;
        while (true){
            System.out.println(i+" hello");
            i++;
        }
    }
    public static void main(String args[]){
        runnableClass1 r=new runnableClass1();
        Thread t=new Thread(r);
        t.start();
        int i=1;
        while (true){
            System.out.println(i+ " world");
            i++;
        }

    }
}
