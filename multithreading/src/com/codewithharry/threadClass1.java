package com.codewithharry;

public class threadClass1 extends Thread
{
    public void run(){
        int i=1;
        while (true){
            System.out.println(i+" hello");
            i++;
        }
    }
    public static void main(String args[]){
        threadClass1 th=new threadClass1();
        th.start();
        int i=1;
        while (true){
            System.out.println(i+ " world");
            i++;
        }

    }
}
