/* Topic : Switch case statement

The switch case in java is used to select one of many code blocks for execution.

Break keyword: As java reaches a break keyword, the control breaks out of the switch block.
The execution of code stops on encountering this keyword, and the case testing inside the block ends as the match is found.
A lot of execution time can be saved because it ignores the rest of the code's execution when there is a break.

Default keyword: The keyword is used to specify the code executed when the expression does not match any test case.

Program :- Using Switch case, Take input as age from the user and print " You are going to become an adult" if user age is equal to 18,
if age =23 print "You are eligible for any job!" and if age =60 print "You are going to get retired" also use break keyword for execution of one statement only.
  
Input : 18
        23
        60
Output : You are going to become an adult
         You are eligible for any job!
         You are going to get retired
         
Testcase: If user take another age as an input 
Output: Enjoy your life!
  
Code :*/

package company.com;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("You are eligible for any job!");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
    }
}
