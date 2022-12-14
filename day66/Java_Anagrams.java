import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        int aVal = 0, bVal = 0;
        if ( a.length() != b.length() )
            return false;
        for ( int i = 0; i < a.length(); i++ ) {
            aVal += (int)a.charAt(i)*(int)a.charAt(i);
            bVal += (int)b.charAt(i)*(int)b.charAt(i);
        }
        return aVal == bVal ? true : false;
    }
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
