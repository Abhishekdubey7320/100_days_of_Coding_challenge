Topic :- Convert Uppercase String into Lowercase String. 
Program :- Print the word taken by user in Uppercase String into Lowercase String.
Sample input :-
  "ABHISHEK"
Sample output :- 
  abhishek
Testcase:- 
  If the word taken by user is already in Lowercase
 Output :-
   Your word already in Lowercase
   
 Code :-
   
package company.com;

import java.util.Scanner;

public class ToLowercase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println(name.toLowerCase());
        if(name==name.toLowerCase()){
            System.out.println(" Your word is already in Lowercase");
        }
    }
}
