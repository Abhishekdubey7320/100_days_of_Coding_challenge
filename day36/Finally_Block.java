/* Topic:- Finally block in exception handling in java .

The finally block in java is used to put important codes such as clean up code e.g. closing the file or closing the connection.
The finally block executes whether exception rise or not and whether exception handled or not.
A finally contains all the crucial statements regardless of the exception occurs or not.

syntax:-
try { 
  //code
}
catch (ExceptionType1 e1) { 
  // catch block
}
finally {
  // finally block always executes
}

Program:-Jav a program to demonstrate finally block in java When exception rise and handled by catch.

  sample output:- inside try block
                ArithmeticException => / by zero
                finally : i execute always.
                  
Explanation:- In this program, we are dividing a number by 0 inside the try block. Here, this code generates an ArithmeticException.

The exception is caught by the catch block. And, then the finally block is executed.
Code:- */

package company.com;

public class Finally_Block {

        public static void main(String[] args)
        {
            try {
                System.out.println("inside try block");

                // Throw an Arithmetic exception
                System.out.println(34 / 0);
            }

            // catch an Arithmetic exception
            catch (ArithmeticException e) {

                System.out.println(
                        "catch : exception handled.");
            }

            // Always execute
            finally {

                System.out.println("finally : i execute always.");
            }
        }
    }

