Topic:- Inheritance
Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another.
With the use of inheritance the information is made manageable in a hierarchical order.

The class which inherits the properties of other is known as subclass (derived class, child class) and 
the class whose properties are inherited is known as superclass (base class, parent class).

Syntax : 

class derived-class extends base-class  
{  
   //methods and fields  
}  
Program :- Java program to illustrate the concept of inheritance

sample input :-
  3
  100
  25

Sample output:-  
  No of gears are 3
  speed of bicycle is 100
  seat height is 25
  
Program Explanation:-  In this program of inheritance,
class Bicycle is a base class, class MountainBike is a derived class that extends the Bicycle class and class Test is a driver class to run the program. 
In the above program, when an object of MountainBike class is created, a copy of all methods and fields of the superclass acquires memory in this object.
That is why by using the object of the subclass we can also access the members of a superclass. 

 Note:- During inheritance only the object of the subclass is created, not the superclass.

package company.com;
     // base class
     class Bicycle {
      // the Bicycle class has two fields
                public int gear;
                public int speed;
                public Bicycle(int gear, int speed)    // the Bicycle class has one constructor
           {
               this.gear = gear;
               this.speed = speed;
           }
           public void applyBrake(int decrement)      // the Bicycle class has three methods
        {
          speed -= decrement;
        }
        public void speedUp(int increment)
       {
        speed += increment;
       }
       // toString() method to print info of Bicycle
          public String toString()
        {
        return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
        }
     }
     class MountainBike extends Bicycle {                         // derived class
         // the MountainBike subclass adds one more field
      public int seatHeight;
      public MountainBike(int gear, int speed, int startHeight)     // the MountainBike subclass has one constructor
       {
        // invoking base-class(Bicycle) constructor
            super(gear, speed);
          seatHeight = startHeight;
      }
      // the MountainBike subclass adds one more method
        public void setHeight(int newValue)
      {
        seatHeight = newValue;
      }
      // overriding toString() method of Bicycle to print more info
       @Override public String toString()
      {
        return (super.toString() + "\nseat height is " + seatHeight);
      }
     }
     public class Inheritance {                                  // driver class
           public static void main(String args[])
          {
             MountainBike mb = new MountainBike(3, 100, 25);
             System.out.println(mb.toString());
         }
  }
