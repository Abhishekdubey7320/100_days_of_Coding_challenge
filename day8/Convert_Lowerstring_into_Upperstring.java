Topic :- String 
4) toUppercase() method
Program :- Take String from user in Lowercase and convert into Uppercase String.
Sample input :- 
  " abhishek"
Sample output :-
  "ABHISHEK"
Testcase:-
  If user take string in Uppercase
  output :-
     Your string is already in Uppercase
     
 Code:-
   
 package company.com;

import java.util.Scanner;

public class ToUppercase {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter name");
            String name=sc.nextLine();
            System.out.println(name.toUpperCase());
            if(name==name.toUpperCase()){
                System.out.println(" Your string is already in Uppercase");
            }
        }
   }
  

