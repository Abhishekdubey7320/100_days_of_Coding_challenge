package com.company;

import java.util.Scanner;
class Three_number {
    int a, b, c;
    void get() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        System.out.println("Enter the value of c");
        c = sc.nextInt();
    }
    void display() {

        System.out.println("value of a;" + a);
        System.out.println("value of c;" + b);
        System.out.println("value of c;" + c);
        double average = (a + b + c) / 3;
        System.out.println("Average:" + average);
    }
}
     class Average {
         public static void main(String[] args) {
             Three_number obj= new Three_number();
             obj.get();
             obj.display();
         }
     }
