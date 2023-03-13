package com.codewithharry;


abstract  class my{
    abstract void display() ;

}


//interface   my{
//    public void display() ;
//}


class  outer2
{
   public void  meth(){
       my m=new my() {public void display() {System.out.println("hello");}};
       m.display();
   }
}


public class anonymous_inner {
    public static void main(String args[]){
        outer2 O=new outer2();
        O.meth();

    }
}
