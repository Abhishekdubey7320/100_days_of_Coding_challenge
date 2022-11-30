/* Topic :- Given two arrays and our task is to find their common elements. 
Solution:- By using the retainAll() method of the HashSet we can find the common elements between two arrays.
  
Syntax: 

// This method keeps only the common elements
// of both Collection in Collection1.

Collections1.retainAll(Collections2)
  
Approach : 

Get the two Arrays.
Create two hashsets and add elements from arrays tp those sets.
Find the common elements in both the sets using Collection.retainAll() method. This method keeps only the common elements of both Collection in Collection1.
Set 1 now contains the common elements only.
Below is the implementation of the above approach

Problem:- Java Program to find common elements in two Arrays using hashsets and retainAll() method.

 Input: - int[] arr1 = {  16, 25, 36, 49, 64, 81, 100 };
          int[] arr2 = { 100, 9, 64, 7, 36, 5, 16 };
Output: -
  
         Array 1: [16, 25, 36, 49, 64, 81, 100]
         Array 2: [100, 9, 64, 7, 36, 5, 16]
         Common elements- [16, 64, 36, 100]

Time Complexity: O(n)
Auxiliary Space: O(n)     
  
Code :- */
  
package company.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonArray_Element {
    public static void FindCommonElements(int[] arr1,
                                          int[] arr2)
    {
        // create hashsets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements from array1
        for (int i : arr1) {
            set1.add(i);
        }

        // Adding elements from array2
        for (int i : arr2) {
            set2.add(i);
        }

        // use retainAll() method to
        // find common elements
        set1.retainAll(set2);
        System.out.println("Common elements- " + set1);
    }

    // main method
    public static void main(String[] args)
    {
        // create Array 1
        int[] arr1
                = {  16, 25, 36, 49, 64, 81, 100 };

        // create Array 2
        int[] arr2 = { 100, 9, 64, 7, 36, 5, 16 };

        // print Array 1
        System.out.println("Array 1: " + Arrays.toString(arr1));
        // print Array 2
        System.out.println("Array 2: "
                + Arrays.toString(arr2));
        FindCommonElements(arr1, arr2);
    }
}

