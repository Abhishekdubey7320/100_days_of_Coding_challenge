/* Topic:- File handling

File Handling is an integral part of any programming language as file handling enables us to store the output of any particular program in a file and
allows us to perform certain operations on it.

In simple words, file handling means reading and writing data to a file.

Program:-
To read a file and seperate vowels and consonants to other files.

Input File :-"D:\File.txt" 
in which we have a sentence :-i am abhishek kumar dubey and  i am learning java.

output:-"D:\vowel.txt"
       iaaieuaueaiaeaiaa
       
       "D:\consonents.txt"
        m bhshk kmr dby nd   m lrnng jv.
        
Code:- */

package company.com;

import java.io.*;

public class IOExceptionException {
    public static void main(String[] args)throws IOException
    {

        try
        {
            FileInputStream fstream = new FileInputStream("D:\\File.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            FileWriter ostream = new FileWriter("D:\\vowel.txt");
            BufferedWriter out = new BufferedWriter(ostream);
            FileWriter opstream = new FileWriter("D:\\consonents.txt");
            BufferedWriter outt = new BufferedWriter(opstream);

            String str=br.readLine();
            char ch;
            for (int i=0;i<str.length();i++)
            {
                ch = str.charAt(i);


                if(( ch == 'a') ||( ch == 'e') ||( ch == 'i') ||( ch == 'o') ||( ch == 'u'))

                {
                    out.write(ch);
                }
                else
                {
                    outt.write(ch);
                }

            }

            out.close();
            outt.close();
            br.close();
        }
        catch (Exception e) {
            System.err.println(e);
        }

    }

}


