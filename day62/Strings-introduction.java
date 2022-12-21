import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
    int a_length = A.length();
    int b_length = B.length();

    int sum_length = a_length + b_length;
    System.out.println(sum_length);

    if((int)A.charAt(0) > (int)B.charAt(0)) System.out.println("Yes");
    else System.out.println("No");

    System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1)+" "+ 
                    Character.toUpperCase(B.charAt(0)) + B.substring(1));
      }
   }



