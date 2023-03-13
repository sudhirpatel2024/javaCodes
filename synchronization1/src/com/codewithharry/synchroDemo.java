package com.codewithharry;
class   MYData{
//    public void display(String str){
//        synchronized (this) {

    synchronized  public void display(String str){
        for (int i = 1; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
    }
}
//}
class MYThread1 extends Thread{
    MYData d;
    public MYThread1(MYData d){
        this.d=d;
    }
    public void run(){
        d.display(" Hello world");
    }
}
class MYThread2 extends Thread{
    MYData d;
    public MYThread2(MYData d){
        this.d=d;
    }
    public void run(){
        d.display(" Welcome");
    }
}


public class synchroDemo {
    public static void main(String args[]){
        MYData data=new MYData();
        MYThread1 t1=new MYThread1(data);
        MYThread2 t2=new MYThread2(data);

        t1.start();
        t2.start();

    }
}
