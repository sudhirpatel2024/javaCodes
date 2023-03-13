package com.codewithharry;

public class jagged_array {
    public static void main(String[] args) {
        int A[][]={{1},{2,3},{4,3,2},{2,3,4,56,7 }};
        for (int x[]:A){
            for (int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }

        int b[][];
        A=new int[3][];
        A[0]=new int[2];
        A[1]=new  int[4];
        A[2]=new  int[7];
        for (int x[]:A){
            for (int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }


    }
}
