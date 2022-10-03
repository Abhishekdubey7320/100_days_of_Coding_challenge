package com.company;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        for(int i=10;i>=1;i--){
            System.out.printf("%d*%d=%d\n",num,i,num*i);
        }
    }
}
