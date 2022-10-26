/* Topic :- Conditional (if-else-if ladder statement)
The if-else-if ladder statement executes one condition from multiple statements.
  
Problem :- Calculate income tax paid by an employee to the government as per as the slabes mentioned below :-
       Income slabs       Tax 
        2.5L-5.0L         5%
        5.0L-10.0L        20%
        Above 10.0L       30%
  
sample input :- 2.3
                2.8
                5.5
                11
sample output :- The total tax paid by the employee is: 0.0
                 The total tax paid by the employee is: 0.014999999999999993
                 The total tax paid by the employee is: 0.225
                 The total tax paid by the employee is: 1.425
                   
Testcase :- if user take input as an income less than 2.5 
output :- The total tax paid by the employee is: 0.0
  
code :- */
  
package company.com;

import java.util.Scanner;

public class Income_tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income in lakh");
        double income= sc.nextDouble();
        double tax=0;
        if(income<=2.5){
            tax=tax+0;
        } else if (income>2.5 && income<=5.0) {
            tax=tax+0.05*(income-2.5);
        } else if (income>5.0 && income<=10) {
            tax=tax+0.05*(5.0-2.5);
            tax=tax+0.2*(income-5.0);
        }
        else if (income>10) {
            tax = tax + 0.05 * (5.0 - 2.5);
            tax = tax + 0.2 * (10.0 - 5.0);
            tax = tax + 0.3 * (income - 10.0);
        }
        System.out.println("The total tax paid by the employee is: " +tax);
    }
}
