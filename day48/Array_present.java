/* Topic: Array

An array is a data structure that contains a group of elements. 
Typically these elements are all of the same data type, such as an integer or string. 
Arrays are commonly used in computer programs to organize data so that a related set of values can be quickly sorted or searched.
All the items of the array are stored at contiguous memory locations.
  
Approaches
There are numerous approaches to check whether a specific element is present in this Array or not in Java. These are – 
1) Using the Linear Search method
2) Using the Binary Search method
3) Using List.contains() method
4) Using Stream.anyMatch() method

Today we discuss: -
1. Using Linear Search Method: 
In this, the list or array is traversed sequentially, and every element is checked. 

Syntax: 

for (int element : arr) {
    if (element == toCheckValue) {
        return true;
    }
}

Program:-  Java program to check whether an element is present in array or not.

input:- 51, 19, 10, 94, 72, 23, 62, 10
output:- Array: [51, 19, 10, 94, 72, 23, 62, 10]
    Is 72 present in the array: true

Time Complexity: O(N)
Auxiliary Space: O(1)

Code:-   */

package company.com;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_present {

        // Function return true if given element
        // found in array
        private static void check(int[] arr, int toCheckValue)
        {
            // check if the specified element
            // is present in the array or not
            // using Linear Search method
            boolean test = false;
            for (int element : arr) {
                if (element == toCheckValue) {
                    test = true;
                    break;
                }
            }

            // Print the result
            System.out.println("Is " + toCheckValue
                    + " present in the array: " + test);
        }

        public static void main(String[] args)
        {

            // Get the array
            int arr[] = { 51, 19, 10, 94, 72, 23, 62, 10 };

            // Get the value to be checked
            int toCheckValue = 72;

            // Print the array
            System.out.println("Array: "
                    + Arrays.toString(arr));

            // Check if this value is
            // present in the array or not
            check(arr, toCheckValue);
        }
    }


 
