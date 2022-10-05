Topic:- Show the length of String.
  
 Sample input :-
   Abhishek
 Sample output :-
   8
Testcase :- If we take space in name 
Output :- 
  space is counted in your String length
  
Code:-
  
package company.com;

import java.util.Scanner;

public class String_Length {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter name");
            String name=sc.nextLine();
            System.out.println(+name.length());
            if(name==" "){
                System.out.println(" Space is counted in your String length");
            }
        }
    }
