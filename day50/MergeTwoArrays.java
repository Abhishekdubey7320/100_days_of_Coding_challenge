/* Topic :- Given two arrays, the task is to merge or concatenate them and store the result into another array.

Method 1: Using Predefined function

First, we initialize two arrays lets say array a and array b, then we will store values in both the arrays.
After that, we will calculate the length of arrays a and b and will store it into the variables lets say a1 and b1.
We need to calculate the length of the array because by using the length of these arrays we can predict the length of the resultant array in which the 
elements will be store after merging.
Then by using System.arraycopy(), we merge both the arrays and the result will be stored in the third array.
    
Problem: -Java Program to demonstrate merge two array using pre-defined method.
  
sample input:- 
              int[] a = { 100, 85, 34, 140 };
              int[] b = { 150, 60, 70, 80 };
sample output:-
              [100, 85, 34, 140, 150, 60, 70, 80]
              
Time Complexity: O(M + N)
Auxiliary Space: O(M + N)

Here, M is the length of array a and N is the length of array b.

Code:- */

package company.com;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args)
    {
        int[] a = { 100, 85, 34, 140 };
        int[] b = { 150, 60, 70, 80 };

        // determines length of firstArray
        int a1 = a.length;

        // determines length of secondArray
        int b1 = b.length;

        // resultant array size
        int c1 = a1 + b1;

        // create the resultant array
        int[] c = new int[c1];

        // using the pre-defined function arraycopy
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);

        // prints the resultant array
        System.out.println(Arrays.toString(c));
    }
}

