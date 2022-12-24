import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */
           String str1="";
    for(int i = A.length()-1;i>=0;  i--){
        str1+=A.charAt(i);
    }
    System.out.println(str1.equals(A)?"Yes":"No");

    }
}
