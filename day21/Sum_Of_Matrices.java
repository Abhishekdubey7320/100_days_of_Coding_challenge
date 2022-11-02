//Code :-

package company.com;

import java.util.Scanner;

public class Sum_Of_Matrices {
        public static void main(String args[])
        {
            //Scanner class to take input
            Scanner sc = new Scanner(System.in);
            // Initializing the 3X3 matrix i.e. 2D array
            //Matrix 1
            int mat1[][] = {{19,25,32},{40,54,62},{70,20,60}};
            //Matrix 2
            int mat2[][] =  {{50,15,10},{98,45,78},{23,73,50}};
            //Result Matrix
            int res[][] = new int[3][3];
            int row, col ;
            // Printing the matrices using our user-defined function
            System.out.print("Matrix 1 : ");
            printMatrix(mat1);
            System.out.print("Matrix 2 :");
            printMatrix(mat2);
            // Loops to add both the matrix elements and store them
            for(row=0;row<3;row++)
                for(col=0;col<3;col++)
                    res[row][col]=mat1[row][col]+mat2[row][col];

            System.out.print("After sum of both the matrix : ");
            printMatrix(res);
        }
        // Function to print the matrix
        static void printMatrix(int arr[][])
        {
            int row, col;
            // Loop to print the elements
            for(row=0;row<3;row++)
            {
                // Used for formatting
                System.out.print("\n");
                for(col=0;col<3;col++)
                {
                    System.out.print(arr[row][col]+" ");
                }
            }
            System.out.print("\n\n");
        }
    }
