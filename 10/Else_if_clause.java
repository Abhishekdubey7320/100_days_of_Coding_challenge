/*Topic :- The else if clause.
  Use the else if clause to specify a new conditiobn if the first condition is false.
    
Program :- Take age from user and check from condition age>55 you are experienced ,age>45 you are semi experienced,
age>35 you are less experienced else you are not experienced. use else if clause.
  
Sample input :-
             60
             50
             40
             20
sample output :-
         "you are experienced"
         "you are semi experienced"
         "you are less experienced"
         "you are not experienced"
Program explained :- In this program ,if user take age  46  it check first condition here in first condition age must be greater than 55 so the condition first
is false again it check condition second where age must be greater than 45 now the condition second is true then it show  you are semi experienced. 
Hence, in this program it check which condition is true if condition is true , program show the result.
code :- */
  
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
