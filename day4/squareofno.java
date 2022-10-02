package com.company;

import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        int digit,sum=0;
        do {
            digit = num % 10;
            sum = sum + (digit*digit);
            num = num / 10;
        }while (num!=0);
        System.out.println("sum of the square of the digit of the number is "+sum);
    }
}

