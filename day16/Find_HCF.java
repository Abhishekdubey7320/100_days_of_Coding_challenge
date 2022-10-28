//Code

package company.com;

import java.util.Scanner;

public class Find_HCF {
        public static void main(String[] args)
        {
             Scanner sc = new Scanner(System.in);
             int dividend, divisor;
             int remainder, hcf = 0;
             System.out.println("Enter the first number ");
             dividend = sc.nextInt();
             System.out.println("Enter the second number ");
             divisor = sc.nextInt();
             do
            {
                remainder = dividend % divisor;
                if(remainder == 0)
                {
                    hcf = divisor;
                }
                else
                {
                    dividend = divisor;
                    divisor = remainder;
                }
            }while(remainder != 0);
             System.out.println("HCF: " + hcf);
        }
    }
    

