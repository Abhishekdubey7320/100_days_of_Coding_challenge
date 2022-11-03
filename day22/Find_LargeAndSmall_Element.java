//Code :-

package company.com;

import java.util.Scanner;

public class Find_LargeAndSmall_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] element = new int[10];
        for (int i = 0; i < element.length; i++) {
            System.out.println("Enter the elements[" + i + "]");
            element[i] = sc.nextInt();
        }
        int largest = element[0];
        int smallest = element[0];
        for (int i = 0; i < element.length; i++) {
            if (element[i] > largest)
                largest = element[i];
            if (element[i] < smallest)
                smallest = element[i];

        }
        System.out.println("Largest is "+largest+" and smallest is "+smallest);
    }
}
