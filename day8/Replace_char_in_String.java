Topic :- String

3) replace method in String

Program :- Replace old char "v" into new char "s" in this String.
sample input :-
   "Abhivhek"
sample output :-
  "Abhishek"
Testcase :-
if we replace old char to new char different letter which is not in your string
output :-
  your output is same as your input.
  
Code:-

package company.com;

public class Replace {
        public static void main(String[] args) {
            String name="Abhivhek";
            System.out.println(name.replace("v","s"));
            // if we replace old char to new char different letter which is not in your string
            //your output is same as your input.
            System.out.println(name.replace("p","k"));
            }
        }
