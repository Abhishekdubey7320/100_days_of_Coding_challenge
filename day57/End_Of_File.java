import java.io.*;
import java.util.*;
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
    Scanner line = new Scanner(System.in);


        int counter = 1;


        while (line.hasNextLine()) {
            String a = line.nextLine();

            System.out.println(counter + " " + a);
            counter++;
        }
    }
}
