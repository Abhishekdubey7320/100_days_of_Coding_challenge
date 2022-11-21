/* Topic: Java FileInputStream Class

Java FileInputStream class obtains input bytes from a file.
It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc. 
You can also read character-stream data. But, for reading streams of characters, it is recommended to use FileReader class.
  
Program: Java Program to Read all characters Using FileInputStream class.
  
Explanation:- READING FROM A FILE

We will write a java program to read all characters from file and print file data on the user screen. 
Let’s understand way to associate a File object with the InputStream:

You can pass the filename to the constructor of the FileInputStream class.
You can create a File object by passing the filename to the File constructor. Then, you can pass the File object to the constructor of the FileInputStream class.

While working with stream classes we have to take care of checked exceptions, In our program, we are doing it using a try-catch block.
  
Output:- Welcome to java
Note:-Before running the code, a text file named as "File.txt" is required to be created. In this file, we are having following content:
Welcome to java

Code:- */
 
  package company.com;

import java.io.FileInputStream;

class File_Reader {
    public static void main(String[] args) {

        try
        {
            FileInputStream file=new FileInputStream("D:\\File.txt");
            int i=0;
            while((i=file.read())!=-1) {
                System.out.print((char) i);
            }
            file.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}
