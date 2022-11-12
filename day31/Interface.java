/* Topic:- Interface
An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).

We use the interface keyword to create an interface in Java. 

Example:-

interface Language {
  public void getType();

  public void getVersion();
}
Here,
Language is an interface.
It includes abstract methods: getType() and getVersion().
Program: calculate area of rectangle by using java interface.
sample input:- length:5, breadth:6
               length:7, breadth:6
               
sample output:-The area of the rectangle is 30
               The area of the rectangle is 42
Code Explanation:-In this Program, we have created an interface named Polygon. The interface contains an abstract method getArea().

Here, the Rect class implements Polygon. And, provides the implementation of the getArea() method.

Code:- */
package company.com;

interface Polygon {
    void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rect implements Polygon {

    // implementation of abstract method
    public void getArea(int length, int breadth)
    {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}
public class Inter_face {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.getArea(5, 6);
        r1.getArea(7, 6);
    }
}
