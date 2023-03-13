package com.apnacollage;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        // write your code here
      /*  System.out.println("hello java");
        String name="aman";
        int age =30;
        String neighbour= "akku";
        String friend= neighbour;
        System.out.println(friend); */

        /*  variables
         byte - 1 [-128 to 127]
        short - 2
        int - 4  [ 1,2,3,4...]
        long - 8
        float - 4    [3.14,.....]
        double - 8
        char - 2  [a,b,c,d]   [single '  ']
        boolean - 1 true/ false         */

       /*   primitive type
       byte age= 30;
        int phone=1234567890;
        long phone2=1234567896554l;
        float pi = 3.122222f;
        char letter ='@';
        boolean isAdult = false; */

        //primitive type
       /*
        String name= "apu";

       System.out.println(name.length());
       String name1 ="raju";
       String name2="sudhir";
       String name3=name1+name2;
        System.out.println(name3);
        String name4=name1+ " and " +name2;
        System.out.println(name4);
        System.out.println(name.charAt(2)); // for cheaking the position of number
        String name5 =name.replace('a','y');
        System.out.println(name5);
        System.out.println(name);  */

//        String name = "aman and akku";
//        System.out.println(name.substring(3,9));
//
//        int[] marks = new int[3];
//        marks[0]=97;
//        marks[1]=89;      // how to print arrays
//        marks[2]=80;
//        System.out.println(marks[0]);
//        System.out.println(marks.length);
//
//        Arrays.sort(marks);
//        System.out.println(marks[0]);
//
//
//        int[] marks = { 97,98,95};
//        int[][]finalMarks={{97,98,95},{95,95,98}};  // arrays
//        System.out.println(finalMarks[0][1]);


//        // casting
//
//        double price = 100.00;
//        double finalPrice=price+18;
//        System.out.println(finalPrice);
//
//        int p=100;
//        int fp=p+ (int)18.6777;   //explicit casting
//        System.out.println(fp);
//
//        //constants
//        int age=30;
//        age=31;
//        age=32;
//        final float pi= 3.14f;
//
//       // operators   + , _ , / , * , %(modulo)
//        int a=2;
//        int b=3;
//        int sum= a+b;
//        System.out.println(sum);

//        int num = 5;
//        System.out.println(++num);  //6
//        System.out.println(--num);  //4

//        System.out.println(Math.min(23,445));
//        System.out.println(Math.max(34.344,34334));
//        System.out.println(Math.random());
//        System.out.println((int)(Math.random()*100));

        //how to input

        Scanner sc= new Scanner(System.in);
       System.out.println("input your agr :");
        int age=sc.nextInt();     //we can take here float boolean and other primitive values

        System.out.println(age);
        String name=sc.nextLine();

        System.out.println("input your name: "+name);
           // if we want output in single word then we can only use here next only
        System.out.println(name);

        //comparison operators
        /* a==b
        a!=b
        a<b
        a>b
        a<=b
        a>=b
         */

        //conditional statements
//        boolean isSunuop= true;
//        if (isSunuop==true)
//            System.out.println("day");
//        else
//            System.out.println("night");

//        int age= 30;
//        if (age>18)
//            System.out.println("can vote");
//        else
//            System.out.println("can't vote");

        //logical operator
//        int a= 30;
//        int b=40;
////        if (a<50 && b<50 )      // and operator
////            System.out.println("both less than 50");
//
//        if (a<50 || b<50)    // logical or operator
//            System.out.println("atleast one less than 50");

//
//        boolean isAdult = true ;
//        if (!isAdult)
//            System.out.println("is adult");  // we can use negation operator in variable name
//        else
//            System.out.println("not adult");

//        Scanner sc = new Scanner(System.in);
//        int cash = sc.nextInt();
//        if (cash<10){
//            System.out.println("can not buy anything");
//            System.out.println("get more cash");
//
//        }
//        else if (cash>=10 && cash<50){
//            System.out.println("can get 1 thing");
//        }
//        else{
//            System.out.println("can get both");
//        }

        //switch statement
//        int day =0; // 1- monday, 2- tuesday ,.....
//        switch (day){
//            case  1:
//                System.out.println("monday");  // if we not use break then it will print all next case
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            default:
//                System.out.println("wed - sun");
//
//        }

//        //loops
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//
//        //1-100
//        for (int i=1;i<=100;i=i+1 ){    //
//            System.out.println(i);
//        }
//        for (int i=100;i>=1;i=i-1 ){    //
//            System.out.println(i);
//        }

//        //while loop
//        int j = 100;
//        while (j>=1){
//            System.out.println(j);
//            j = j-1;
//        }

//        // do while
//        int k = 100;
//        do {
//            System.out.println(k);
//            k=k-1;
//        }while (k>=3);

//        Scanner sc= new Scanner(System.in);
//         int number=0;
//        do {
//            System.out.println("input a number ");
//             number =sc.nextInt();
//            System.out.print("here is your name");
//            String name=sc.nextLine();
//            System.out.println( number);
//        } while (number>=0);
//        System.out.println("the end");

//        int i =0;
//        while (true){
//            if (i==3){
//                i=i+1;
//                continue;
//            }
//            System.out.println(i);
//            i=i+1;
//            if (i>10){
//                break;
//            }
//            }
        //exeption handling  try and catch

//        int[] marks={97,98,95};
//        System.out.println(marks[5]);
//        System.out.println("the name is aman");

//        int[] marks={97,98,95};
//        try {
//            System.out.println(marks[5]);  // if we give hear 0,1,2 then it will show the output also
//        }catch (Exception exception){
//            //do thing after catching
//        }
//        System.out.println("the name is aman");

        // method









        //print the sum of natural number

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=0;
//        for (int i = 1;i<=n;i++){
//            sum=sum+i;
//
//        }
//        System.out.println(sum);

        //print the table of any number

//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int table=0;
////        for (int i=1;i<11;i++){
////            System.out.println(i*n);
////        }
//
////        int i=1;
////        while (i<11){
////
////            System.out.println(i*n);
////            i++;
////
////        }
////        int i=1;
////        do {
////            System.out.println(i*n);
////            i++;
////        }while (i<11);

        // decimal to binary converter

//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//
//        String z="";
//        while (n>1){
//            z=z+Integer.toString(n%2);
//            n=(int)n/2;
//
//        }
//        z="1"+z;
//        System.out.println(z);








        




















































    }




































}
