package com.codewithharry;

import java.util.Scanner;

public class exercise {

    public static void combineString(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        String name[]=new String[a];

        sc.nextLine();
        for (int i=0;i< name.length;i++){
            name[i]=sc.nextLine();
        }
        String last="";

        for (int i=0;i< name.length;i++){
            last+=name[i];
        }
        System.out.println(last.length());
    }

    public static void changeEToI(){
        Scanner sc=new Scanner(System.in);

        String original= sc.nextLine();
        String result="";

        for (int i=0;i<original.length();i++){
            if (original.charAt(i)=='e'){
                result += 'i';
            }else result+=original.charAt(i);
        }
        System.out.println(result);
    }

    public static void removeSpecialChar(){
        Scanner sc=new Scanner(System.in);
        String email= sc.nextLine();
        String uname="";
        for (int i=0;i<email.length();i++){
            if (email.charAt(i)=='@'){
                break;
            }else uname+=email.charAt(i);
        }

        System.out.println(uname);
    }

    public static void main(String args[]){

        //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

//         combineString();


        //Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
        //Example :
        //original = “eabcdef’ ; result = “iabcdif”
        //Original = “xyz” ; result = “xyz”


//        changeEToI();



        //Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
        //Example :
        //email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
        //email = “helloWorld123@gmail.com”; username = “helloWorld123”

//        removeSpecialChar();
int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }







    }
}
