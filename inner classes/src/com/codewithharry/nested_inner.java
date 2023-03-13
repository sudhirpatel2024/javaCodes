package com.codewithharry;
class outer{
    int x=10;
    class inner{
        int y=20;
        public void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    public void  outerDisplay(){
        inner i=new inner();
        i.innerDisplay();
        System.out.println(i.y);
    }

}

public class nested_inner {
    public static void  main(String args[]){
        outer o=new outer();
        o.outerDisplay();
        outer.inner oi=new outer().new inner();
        oi.innerDisplay();



    }
}
