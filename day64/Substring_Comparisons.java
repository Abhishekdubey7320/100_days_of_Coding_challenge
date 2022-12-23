import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int k1=k-1;
    int c=s.length()-k1;
    String jk = "";
    String s1[]=new String[c];
    for(int i=0;i<s.length();i++) 
    {
        if(i<s.length()-k1)
        {
            for(int j=i;j<i+k;j++) 
            { 
            jk+= String.valueOf(s.charAt(j));
            }
        s1[i]=jk;
        jk="";
        }
    }

    String s2=""; 
    for(int j=0;j<s.length()-k1;j++)
    {
        for(int i=0;i<s.length()-k;i++)
     {
       if(s1[i].compareTo(s1[i+1])>=0)
       { 
           s2=s1[i];
           s1[i]=s1[i+1];
           s1[i+1]=s2;
        }
     }
    }
    smallest=s1[0];

    largest=s1[s.length()-(k)];
    return smallest + "\n" + largest;
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
