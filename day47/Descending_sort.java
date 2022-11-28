/* Java Program to Sort the Array Elements in Descending Order.

Sorting is a process of arranging items systematically.
sort() is an inbuilt function from java.util.Arrays which is used to sort an array of elements in optimized complexity.
  
Approaches
There are numerous approaches to sort the given array in descending order in Java. today we discuss about Using Sorting and reversing.
Here, 
Sort the given array.
Reverse the sorted array.
  
Input:-  10, 20, 43, 24, 15, 46
Output:- 46, 43, 24, 20, 15, 10
  
Time Complexity: O(N log N) 

Code:- */

package company.com;

import java.util.Arrays;

public class Descending {
        public static void main(String[] args)
        {

            // Initializing the array
            int array[] = { 10, 20, 43, 24, 15, 46 };

            // Sorting the array in ascending order
            Arrays.sort(array);

            // Reversing the array
            reverse(array);

            // Printing the elements
            System.out.println(Arrays.toString(array));
        }

        public static void reverse(int[] array)
        {

            // Length of the array
            int n = array.length;

            // Swapping the first half elements with last half
            // elements
            for (int i = 0; i < n / 2; i++) {

                // Storing the first half elements temporarily
                int temp = array[i];

                // Assigning the first half to the last half
                array[i] = array[n - i - 1];

                // Assigning the last half to the first half
                array[n - i - 1] = temp;
            }
        }
    }

