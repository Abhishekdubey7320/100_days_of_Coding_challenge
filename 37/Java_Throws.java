/* Topic:- Java Throws keyword

The Java throws keyword is used to declare an exception.
It gives an information to the programmer that there may occur an exception. So, it is better for the programmer to provide the exception handling code so 
that the normal flow of the program can be maintained.

Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException,
it is programmers' fault that he is not checking the code before it being used.
  
Syntax of Java throws
    return_type method_name() throws exception_class_name{  
      //method code  
    }  
Program:- Program of Java throws clause which describes that checked exceptions can be propagated by throws keyword.
  
output:- exception handled
         normal flow...
Code:- */
  
package company.com;

import java.io.IOException;

public class Java_Throws
       {
        //defining a method
        void m()throws IOException {
            throw new IOException("device error");//checked exception
        }
           void n()throws IOException{
               m();
           }
           void p(){
               try{
                   n();
               }catch(Exception e){System.out.println("exception handled");}
           }
           public static void main(String args[]){
               Java_Throws obj=new Java_Throws();
               obj.p();
               System.out.println("normal flow...");
           }
       }


