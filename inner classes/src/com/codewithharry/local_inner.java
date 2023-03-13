package com.codewithharry;
class  outer1
{
    public void  display()
    {
        class inner1
        {
            public void show()
            {
                System.out.println("hello");
            }
        }
        new  inner1().show();
        inner1 i=new inner1();
        i.show();
    }
}

public class local_inner {
    public static void main(String args[])
    {
        outer1 o=new outer1();
        o.display();

    }
}
