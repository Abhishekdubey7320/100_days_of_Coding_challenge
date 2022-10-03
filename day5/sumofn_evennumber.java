package com.company;
import java.util.Scanner;
public class Sumofn_evennumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter any number");
        int n=sc.nextInt();
        for(int i=0; i<n;i++){
            sum=sum+(2*i);
        }
        System.out.println("sum of even number is :");
        System.out.println(sum);
    }

}
