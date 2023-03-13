package com.codewithharry;
class  outer3
{
    int x=10;
    static int y=12;
    static class my1
    {
        public void  show()
        {
            System.out.println(y);
        }
    }

}

public class static_inner
{
    public static void main(String args[])
    {
        outer3.my1 o=new outer3.my1();
        o.show();


    }
}
