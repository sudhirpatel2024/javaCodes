package com.codewithharry;
class thread extends Thread{
    public void run(){
        int count =1;
        while (true){
            System.out.println(count++ +" Thread");
        }
    }
}

public class daemon_join_yield {
    public static void main(String args[])throws Exception{
        thread t= new thread();
//        t.setDaemon(true);              // 2nd
        t.start();
        int count =1;
        while (true){
            System.out.println(count++ +" main");
//            Thread.yield();    //3rd
        }


//        Thread mainThread=Thread.currentThread();    2nd
//        mainThread.join();



//        try {
//            Thread.sleep(100);            // 1st
//        }catch (Exception e){
//
//        }


    }
}
