package com.codewithharry;

public class variable_argument {


//    static void show(int ...A){
//        for (int x:A){
//            System.out.println(x);
//        }
//
//    }
//    public static void main(String args[]){
//        show();
//        show(10,20,30);
//        show(new int[]{3,4,5,6,7,8,});


    //maximum of numbers using varagrs
//    static int max(int ...a)
//    {
//        if (a.length==0)return Integer.MIN_VALUE;
//        int max=a[0];
//        for (int i=1;i<a.length;i++)
//           if (a[i]>max)max=a[i];
//        return max;
//    }
//    public static void main(String args[])
//    {
//        System.out.println(max());
//        System.out.println(max(10));
//        System.out.println(max(10,20,30));
//        System.out.println(max(10,20));


    //sum of all element using varargs

//    static int sum(int ...a)
//    {
//        int sum=0;
//
//        for (int i=0;i<a.length;i++){
//            sum+=a[i];
//        }return sum;
//
//        }
//        public static void main(String args[]){
//            System.out.println(sum(12,12,45,34,544,45));

    //

    static double sum(double ...P)
    {
        double sum=0;

        for(int i=0;i<P.length;i++)
            sum+=P[i];

        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000) return sum*0.15;
        else return sum*0.20;

    }
    public static void main(String args[])
    {
        System.out.println(sum(34,56,45));







    }
}
