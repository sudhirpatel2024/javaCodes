package com.codewithharry;

public class practice_function {

    public static void add(int x,int y){
        System.out.println(x+y);
    }

    public static int Add(int x,int y){
        return x+y;
    }
    public static void multiply(int x,int y){
        System.out.println(x*y);
    }

    public static void factorial(int x){
        int fact=1;
        for (int i=x;i>=1;i--){
            fact=i*fact;
        }
        System.out.println(fact);
    }

    public static int factorial1(int x){
        int fact=1;
        for (int i=x;i>=1;i--){
            fact=i*fact;
        }
        return  fact;
    }

    public static void checkEven(int x){
        if (x%2==0){
            System.out.println("Even number");
        }else System.out.println("odd number");
    }

    public static void createTable(int x){
        for (int i=1;i<=10;i++){
            System.out.println(i+" X "+x+" = "+i*x);
        }
    }


    public static void main(String args[]){
//        add(3,5);
//        System.out.println(Add(3,5));
//
//        multiply(4,5);

        factorial(120);
//         System.out.println(factorial1(5));

//        checkEven(5);
//        createTable(15);





  }
}
