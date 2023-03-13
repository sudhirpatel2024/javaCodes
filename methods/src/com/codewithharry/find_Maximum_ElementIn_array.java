package com.codewithharry;

public class find_Maximum_ElementIn_array {
    static int arr[]={10, 324, 45, 90, 8};
    static int largest()
    {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;

    }
    public static void main(String args[]){
        System.out.println(largest());

    }
}
