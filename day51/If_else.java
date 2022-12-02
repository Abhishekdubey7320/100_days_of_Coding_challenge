/* Java If-Else hackerrank solution

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. 
An if-else statement has the following logical flow:

Task
Given an integer, n, perform the following conditional actions:

If  is odd, print 
Weird
If  is even and in the inclusive range of 2 to 5, print 
Not Weird
If  is even and in the inclusive range of 6 to 20, print 
Weird
If  is even and greater than 20, print 
Not Weird

Input Format
A single line containing a positive integer, n.

Constraints
1<=n<=100
Output Format
Print 
Weird
 if the number is weird; otherwise, print 
Not Weird
.
Sample Input 0
3
Sample Output 0
Weird
Sample Input 1
24
Sample Output 1
Not Weird

Testcase
Sample Case 0: n=3
n is odd and odd numbers are weird, so we print 
Weird
.
Sample Case 1: n=24
n>20 and n is even, so it isn’t weird. Thus, we print 
Not Weird
.
Code  */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N%2!=0)
        System.out.println("Weird");
        else if((N%2==0) && 2<= N & N<6)
        System.out.println("Not Weird");
        else if((N%2==0) && 6<= N & N<22)
        System.out.println("Weird");
        else 
        System.out.println("Not Weird");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }
}
