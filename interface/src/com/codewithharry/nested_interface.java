package com.codewithharry;
class  phone{
    public void  call(){
        System.out.println("call");
    }
    public void  sms(){
        System.out.println("sms");
    }
}
interface  Icamera{
     void click();
     void  record();
     void  save();
    }

interface  ImusicPlayer{
    void play();
    void pause();
    void  resume();
    void stop();

}
class  smartPhone extends phone implements Icamera ,ImusicPlayer{
    public void videoCall(){
        System.out.println("videoCall");
    }
    public void  chat(){
        System.out.println("chatting");
    }
    public void click(){
        System.out.println("click");
    }
    public void record() {
        System.out.println("Smart Phone recording video");
    }
    public void play() {
        System.out.println("Smart Phone playing music");
    }
    public void stop() {
        System.out.println("stop");
    }
    public void pause() {
        System.out.println("pause");
    }
    public void resume() {
        System.out.println("resume");
    }

    public void save() {
        System.out.println("save");
    }


}

public class nested_interface {
    public static void  main(String args[]){
        ImusicPlayer sp=new smartPhone();
        sp.pause();
        Icamera sp1=new smartPhone();
        sp1.click();
        sp1.record();
        phone sp2=new smartPhone();
        sp2.call();

    }
}
