package com.company;

import java.util.Scanner;

public class hmark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of first student:");
        int marks=sc.nextInt();
        System.out.println("Enter the marks of second student:");
        int marks1=sc.nextInt();
        System.out.println("enter the marks of third student:");
        int marks2=sc.nextInt();
        if(marks>marks1 && marks>marks2) {
            System.out.println("First student got highest marks");
        }
        else if (marks1>marks && marks1>marks2) {
            System.out.println("Second student got highest marks");
        }
            else if(marks2>marks && marks2>marks1) {
            System.out.println("Third student got highest marks");
        }
    }
}
