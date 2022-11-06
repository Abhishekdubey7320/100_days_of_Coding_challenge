/*Topic:-Method_Overriding

Using method overriding, child class can provide its own implementation of the method which is already present in the parent class or declared in parent interface.

In other words, when method in the sub class has the same name, same parameters and same return type (or co-variant return type) as parent class or interface, 
then we can say that child class method has overridden the parent class method.
  
Explanation of code :- We have two classes : parent class Shape and child class Circle which extends Shape class.

Both the class has common method draw().
Circle class has provided its own implementation of draw() method. In other words, it has overridden draw() method of Shape class.

Along with draw() method, Shape class also contains fill() method which has not been overridden by Circle class.
But this method will be inherited to Circle class with default implementation.

Purpose of method overriding is very clear here. Circle class wants to provide its own implementation of draw() method so that when it calls this method,
it will print 'Circle' instead of 'Shape'.
  
Output:- Circle
         Shape Filled with color
  
Code:-*/
package company.com;

        class Shape{
        public void draw()
        {
            System.out.println("Shape");
        }
        public void fill()
          {
            System.out.println("Shape Filled with color");
          }
        }
        class Circle extends Shape{
            public void draw()
        {
            System.out.println("Circle");
        }
    }
    class Square extends Shape{
        public void draw()
        {
            System.out.println("Square");
        }
    }
    class Hexagon extends Shape{
        public void draw()
        {
            System.out.println("Hexagon");
        }
    }
    public class Method_overriden {

    public static void main(String[] args) {
        Shape s = new Circle();

        s.draw();
        s.fill();
    }
}
