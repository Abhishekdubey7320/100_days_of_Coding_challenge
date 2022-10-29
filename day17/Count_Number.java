//Code:-
package company.com;

import java.util.Scanner;

public class Count_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CountPositive=0;
        int CountZero=0;
        int CountNegative=0;
        char choice=0;
        do {
            System.out.println("Enter any number");
            int num = sc.nextInt();
            if (num > 0) {
                CountPositive++;
            }  else if(num < 0)
            {
                CountNegative++;
            }
            else {
                CountZero++;
            }
            System.out.println("Enter your choice y or n");
            choice=sc.next().charAt(0);
        }while(choice=='y' || choice == 'Y');
        System.out.println("Positive numbers: " + CountPositive);
        System.out.println("Negative numbers: " + CountNegative);
        System.out.println("Zero numbers: " + CountZero);
        }
    }

