class Solution {

public boolean isPowerOfFour(int p) {

return (p%3==1 && (p&p-1)==0);
   }
}
