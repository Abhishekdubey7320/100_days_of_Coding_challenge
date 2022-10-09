/*Topic :- Logical operator AND 
Program :- For logical AND operator check what boolean return
           1) if boolean a= true ,boolean b=false;
           2) if boolean a=true ,boolean b=true;
sample input: 
         boolean a= true ,boolean b=false;
         boolean a= true ,boolean b=true;
sample output :
         false
         true
           
Testcase : If we take boolean a=true ,boolean b=true 
  sample output : True else false
    
Code :- */
  
    package company.com;

public class logical {
    public static void main(String[] args) {
        System.out.println(" For logical AND...");
        boolean a = true;
      /*  boolean b = false;
        if (a && b) {
            System.out.println("true");
        } else {
            System.out.println("false");
           // return false */
        boolean b=true;
        if(a && b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

