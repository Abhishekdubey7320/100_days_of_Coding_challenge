package com.company;
import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int num= sc.nextInt();
        int i,sum=0;
        for(i=1;i<=num/2;i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num==sum){
            System.out.println("The no is a perfect number");
            }
        else{
            System.out.println("The number is not a perfect number");
        }
    }
}
