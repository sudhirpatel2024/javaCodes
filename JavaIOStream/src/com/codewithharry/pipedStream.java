package com.codewithharry;
import java.io.*;
class producer extends Thread
{
    OutputStream os;
    public producer(OutputStream o){
        os=o;
    }
    public void run(){
        int count =1;
        while (true){
            try {
                os.write(count);
                os.flush();

                System.out.println("producer "+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            }catch(Exception e) {
//                System.out.println(e);

            }



        }
    }

}
class consumer extends Thread
{
    InputStream is;
    public consumer(InputStream s){
        is=s;
    }
    public void run(){
        int x =1;
        while (true){
            try {
               x=is.read();


                System.out.println("consumer "+x);
                System.out.flush();
            }catch(Exception e) {
                System.out.println(e);
            }



        }
    }

}


public class pipedStream {
    public static void main(String args[]) throws Exception{
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        pos.connect(pis);
        producer p=new producer(pos);
        consumer c=new consumer(pis);

        p.start();
        c.start();


    }
}
