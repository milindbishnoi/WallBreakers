class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        if(n<=0)
            return false;
        int c=0;
        n=Math.abs(n);
    while(n!=0)
     {
        if(n%2==1)
            c++;
        n>>=1;
         if(c>1)
             return false;
     }
        return true;
    }
}