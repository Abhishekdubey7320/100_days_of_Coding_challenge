/* Topic:- Single Inheritance
In single inheritance, subclasses inherit the features of one superclass. In the image below, class A serves as a base class for the derived class B.
  
Program:-  Java program to illustrate the concept of single inheritance.
Sample input:- Geeks
               for
sample output :- Geeks
                 for
                 Geeks
Program Explanation :- In this program we have class one which is super class and class Two is sub class.
we take one method in super class which is  public void print_Geek() now simply we print input "Geek" in this method.
Similarly, In sub class we have one method public void print_for() in which we print the input "for". 
Now we take a public class which contain main method, Here sub class one inherit the super class Two.
first we creat object of sub class in main method afterthat we call the object of method .

Code:- */
  
package company.com;

class one{
    public void print_Geek(){
        System.out.println("Geeks");
    }
}
class Two extends one{
    public void print_for(){
        System.out.println("for");
    }
}
public class Single_Inheritance {
    public static void main(String[] args) {
        Two ob=new Two();
        ob.print_Geek();
        ob.print_for();
        ob.print_Geek();
    }
}
