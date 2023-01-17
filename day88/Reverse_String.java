class Solution {
    public String reverseWords(String s) {
         int i = s.length() -1 ;
    String abhii = "";
    while(i >= 0){

        // first remoove the  whitspace from the last of the given string 
        while(i >=0 && s.charAt(i)== ' '){
            i--;
        }
        // Apply the condition to check whether the string end or not end 
        if(i< 0) {
            break ;
        }
        // Store the last index in some other variable 
        int j = i ;
        while(i >=0 && s.charAt(i) != ' '){
           i-- ;
        }

        if(abhii.length() == 0){
            abhii = abhii.concat(s.substring(i+1 , j+1));
        }else{
            abhii = abhii.concat(' ' + s.substring(i +1 , j+ 1));
        }

    }
    return abhii ;
}
}
