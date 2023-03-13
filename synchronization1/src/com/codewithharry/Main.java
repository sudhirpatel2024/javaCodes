package com.codewithharry;
class atm{
    synchronized public void checkBalance(String name){
        System.out.println(name +" checking");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println(" balance");
    }
    synchronized public void withdraw(String name, int amount){
        System.out.println(name +" withdrawing");
        try {
            Thread.sleep(1000);
        }catch (Exception e) {
        }
        System.out.println(" amount");
    }
}
class customer extends Thread{
    String name;
    int amount;
    atm ATM;

    customer(String n, atm a,int amt){
        name =n;
        ATM =a;
        amount =amt;
    }
    public void useATM(){
        ATM.checkBalance(name);
        ATM.withdraw(name, amount);
    }
    public void run(){
        useATM();
    }
}


public class Main {

    public static void main(String[] args) {
        atm ATM=new atm();
        customer c1=new customer("Smith",ATM,100);
        customer c2=new customer("John",ATM,200);
        c1.start();
        c2.start();

        // write your code here
    }
}
