Topic:- String(method in String)
5) String.startsWith() 

Program:- Here String name="Abhishek" check using String.startWith(),It return boolean true or false.
Sample input:-            
           "A"
           "b"
          ("b",1)
Sample output:-
           true
           false
           true 
Testcase :- If we take second to last letter of name in this method with correct offset
 it return true else false

  
package company.com;

public class String_start_with {
        public static void main(String[] args) {
            String name = "Abhishek";
            //no offset mentioned;hence,offset is 0 in this
            System.out.println(name.startsWith("A"));
            //true

            //no offset mentioned;hence,offset is 0 in this
            System.out.println(name.startsWith("b"));
            //false

            //offset is 1
            System.out.println(name.startsWith("b",1));
        }
}

