/* TOPIC: - MULTIPLE INHERITANCE BY INTERFACE 

If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.

Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
  
Explanation:- As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity.
However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class.

For example:
Program:- To show multiple inheritance by interface in java.

In this program we have two interface printable and showable, printable interface have one method print() and showable interface have also one method show().
Here we take a class A7 which implements  the interface printable and showable both. 
Here, in print method we take a string and also in a show method we take string as an input.
Now, under main method we create an object of the class A7 after we call the object of print method and show method.

sample output:-Hello
              Welcome

Code:- */

package company.com;

 interface printable {
        void print();
    }
    interface Showable{
        void show();
    }
    class A7 implements printable,Showable{
        public void print(){System.out.println("Hello");}
        public void show(){System.out.println("Welcome");}

        public static void main(String args[]){
            A7 obj = new A7();
            obj.print();
            obj.show();
        }
    }

