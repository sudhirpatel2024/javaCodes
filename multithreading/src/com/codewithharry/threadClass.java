package com.codewithharry;
class MyThread extends Thread{
    public void run(){
        int i=1;
        while (true){
            System.out.println(i+" hello");
            i++;
        }
    }
}


public class threadClass {
    public static void main(String args[]){
        MyThread t=new MyThread();
        t.start();
        int i=1;
        while (true){
            System.out.println(i+ " world");
            i++;
        }

    }
}
