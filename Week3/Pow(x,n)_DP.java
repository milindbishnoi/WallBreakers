class Solution {
    
    //Using DP
    
    public double myPow(double x,int n)
    {
        double ans=1.0;
        if(n<0)
        {
            n=-n;
            x=1/x;
        }
        while(n>=0)
        {
            if((n&1)==1)
                ans*=x;
            x*=x;
            n=n>>1;
        }
        return ans;
    }
}