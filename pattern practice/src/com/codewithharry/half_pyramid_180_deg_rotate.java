package com.codewithharry;

public class half_pyramid_180_deg_rotate {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
}
