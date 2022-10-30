//Code:-
  package company.com;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        {
            Scanner sc= new Scanner(System.in);

            int number;  // To hold number of terms

            double sum = 0;

            System.out.print("Enter number of terms of series : ");
            number = sc.nextInt();

            for(int i = 1; i <= number; i++)
            {
                sum += 1.0/i;
            }

            System.out.println("sum: " + sum);
        }
    }
}
