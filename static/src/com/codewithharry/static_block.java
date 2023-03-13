package com.codewithharry;
//public class static_block {
//    static {
//        System.out.println("block 1");
//    }
//    public static void main(String args[]) {
//        System.out.println("main");
//    }
//    static {
//        System.out.println("block 2");
//    }
//}


class  test1{
    static {
        System.out.println("block 1");
    }
    static {
        System.out.println("block 2");
    }

}

public class static_block {

    public static void main(String args[]) {
//        test1 t=new test1();
        System.out.println("main");
        test1 t=new test1();
    }

}


