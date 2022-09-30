package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = sc.nextInt();
        int last, sum = 0, no;
        no = num;
        do {
            last = no % 10;
            //System.out.println(last);
            sum = sum + (last * last * last);
            no = no / 10;
        } while (no != 0);
        System.out.println(num);
        if (sum == num) {
            System.out.println("The number is an armstrong");
        } else {
            System.out.println("The number is not an armstrong number");
        }
    }
}
