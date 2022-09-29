package com.company;



import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st subject marks:");
        float S1marks = sc.nextInt();
        System.out.println("Enter 2nd subject marks:");
        float S2marks = sc.nextInt();
        System.out.println("Enter 3rd subject marks:");
        float S3marks = sc.nextInt();
        System.out.println("Enter 4th subject marks:");
        float S4marks = sc.nextInt();
        System.out.println("Enter 5th subject marks:");
        float S5marks = sc.nextInt();
        float sum = S1marks + S2marks + S3marks + S4marks + S5marks;
        float percentage = (sum*100)/500;
        System.out.println("percentage"+percentage);
    }
}

