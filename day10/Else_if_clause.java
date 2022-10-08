/*Topic :- Else if clause
Use the else if clause to specify a new condition if the first condition is false.
Program :-
Take the age from user and check which condition is true if age>55 you are experienced, age>45 you are semi experienced,
age>35 you are less experienced else you are not experienced.
Sample input:-
   60
   50
   40
   30
Sample output:-
  "you are experienced"
  "you are semi experienced"
  "you are less experienced"
  "you are not experienced"

Explantaion :- In this program if user take the age 46 it check condition first here condition first is age must should be greater than 55 
here the condition first is false then it check condition second now condition second is true so it show the result. when the condition is true 
program execute the result.

Code:-*/

package company.com;

import java.util.Scanner;

public class Else_if_clause {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
       int age=sc.nextInt();
       if(age>55){
        System.out.println("You are experienced");
    }
       else if(age>45){
           System.out.println("You are semi experienced");
       } else if (age>35) {
           System.out.println("You are less experienced");
       }
         else{
           System.out.println("You are not experienced");
       }
    }
}
