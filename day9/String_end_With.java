Topic :- String (string method)
6) String.endWith();

Program:- 
Here String_name = "Abhishek" check using String.endWith(),it return boolean true or false.
  
sample input:-
         ("ek")
         ("h")
sample output:-
        true
        false
code:-
  
package company.com;

public class String_end_with {
        public static void main(String[] args) {
            String name = "Abhishek";

            System.out.println(name.endsWith("ek"));
            //true

            System.out.println(name.endsWith("h"));
            //false

        }
    }
