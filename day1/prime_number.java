package com.company;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int i, count;
        System.out.println("enter any number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("prime number between 1 to " + num + "are");
        for (int j = 2; j <= num; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.println(j + " ");
        }
    }
}
