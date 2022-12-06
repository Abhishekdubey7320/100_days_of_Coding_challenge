
import java.io.*; 
import java.util.*;

public class Solution {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();

    if (q>=0 && q<=500){
        for (int i=1; i<=q; i++){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        if ((a>=0&&a<=50)&&(b>=0&&b<=50)&&(n>=1&&n<=15)){
            int sum = a+b;
        System.out.print(sum+" ");
        int fact = 1;
        for (int j=1;j<n;j++){
            fact *=2;
            sum+=fact*b;
            System.out.print(sum+" ");
        }
        System.out.println();
        }

    }
    }

}
}
