/* Topic:- Abstraction
The major use of abstract classes and methods is to achieve abstraction in Java.

Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information.
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Example of abstract class

abstract class A{}  
//Example of abstract method
abstract void printStatus();     //no method body and abstract 

Java program to illustratethe concept of Abstraction.

output: - MountainBike Brake
          SportsBike Brake
          
Explanation :- A Program of abstraction can be motorbike brakes. We know what brake does. When we apply the brake, 
the motorbike will stop. However, the working of the brake is kept hidden from us.

The major advantage of hiding the working of the brake is that now the manufacturer can implement brake differently for different motorbikes, 
however, what brake does will be the same.
  
In this Program, we have created an abstract super class MotorBike. The superclass MotorBike has an abstract method brake().

The brake() method cannot be implemented inside MotorBike. It is because every bike has different implementation of brakes.
So, all the subclasses of MotorBike would have different implementation of brake().

So, the implementation of brake() in MotorBike is kept hidden.

Here, SeaBike makes its own implementation of brake() and SportsBike makes its own implementation of brake().
  
Code:- */

package company.com;


abstract class MotorBike {
    abstract void brake();
}

class SportsBike extends MotorBike {

    // implementation of abstract method
    public void brake() {
        System.out.println("SportsBike Brake");
    }
}

class SeaBike extends MotorBike {

    // implementation of abstract method
    public void brake() {
        System.out.println("MountainBike Brake");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        SeaBike m1 = new SeaBike();
        m1.brake();
        SportsBike s1 = new SportsBike();
        s1.brake();
    }
}

