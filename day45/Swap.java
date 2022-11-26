/* Topic:- Swapping in java

Swapping is one of the concepts which is frequently used in programs. Swapping means the interchanging of values of variables. 
It is done with the data in memory. Swapping can be done either with the help of one temporary variable or without using the temporary variable

Problem :- Java program to Swap two numbers using the temporary variable.

input:- num1=10
        num2=20

Output:- Original values before swapping are:
Value of number 1 is 10
Value of number 2 is 20
Values after swapping are:
Value of number 1 is 20
Value of number 2 is 10

Explanation:-
In this program, we have two variables named num1 and num2 with values of 10 and 20, respectively. 
A temporary variable with the name temp is used of the same data type of the variables num1 and num2. The swapping is processed in 3 steps:

The value of ‘num1’ (i.e. 10) is assigned to the temporary variable ‘temp’, so now the value of ‘temp’ is 10.
The value of ‘num2’ (i.e. 20) is assigned to the ‘num1’ variable, i.e. now the value of the ‘num1’ variable is 20.
The value of the ‘temp’ variable (i.e. 10) assigned in step 1 is now assigned to the ‘num 2’ variable, i.e. the value of the ‘num2’ variable becomes 10 now.
Finally, the values of the variables are swapped or interchanged, and the swapped values are printed on the console.
  
Code:- */

package company.com;

public class Swap {

    public static void main(String[] args)
    {
        int num1=10;
        int num2 =20;

      // Printing values of numbers before swapping in order to see the change
      System.out.println("Original values before swapping are:");
      System.out.println("Value of number 1 is " +num1); System.out.println("Value of number 2 is " +num2);

      // Value of num1, i.e. 10 is assigned to temp variable int temp = num1;
      // Value of num2, i.e. 20 is assigned to num1 variable num1 = num2;
      // Value of temp variable, i.e. 10 (assigned by num1) is assigned to num2
        int temp = num1; num1 = num2;
        num2 = temp;

       // Printing values of numbers after swapping in order to see the change
        System.out.println("Values after swapping are:");
        System.out.println("Value of number 1 is " +num1);
        System.out.println("Value of number 2 is " +num2);
    }
}
