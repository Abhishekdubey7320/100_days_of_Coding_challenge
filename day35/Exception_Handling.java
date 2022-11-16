/* Topic:- Exception Handling

The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
Here's a list of different approaches to handle exceptions in Java.

1) try...catch block
2) finally block
3) throw and throws keyword

Today we will discuss try...catch block.
1. Java try...catch block
The try-catch block is used to handle exceptions in Java.

Syntax:-

try {
  // code
}
catch(Exception e) {
  // code
}

Here, we have placed the code that might generate an exception inside the try block. Every try block is followed by a catch block.

When an exception occurs, it is caught by the catch block. The catch block cannot be used without the try block.

Program: - Exception handling using try...catch.
  
sample output: - ArithmeticException:-/ by zero

Explanation: -In this Program, we are trying to divide a number by 0. Here, this code generates an exception.

To handle the exception, we have put the code, 5 / 0 inside the try block. Now when an exception occurs, the rest of the code inside the try block is skipped.

The catch block catches the exception and statements inside the catch block is executed.

If none of the statements in the try block generates an exception, the catch block is skipped.


Code: - */
  
package company.com;

public class Except_Handling
      {
    public static void main(String[] args)
    {
        try
         {
             // code that generate exception

             int divideByZero=5/0;
             
             System.out.println("Rest of code in try block");
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException:-"+e.getMessage());
        }
    }
}

