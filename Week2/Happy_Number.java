class Solution {
    public boolean isHappy(long n) 
    {
        long nn=0;
        HashSet<Long> map=new HashSet<>();
        n=Math.abs(n);
        map.add(n);
        if(n==1)
            return true;
        while(nn!=1)
        {
            nn=0;
        while(n!=0)
        {
            long r=n%10;
            nn+=r*r;
            n/=10;
        }
           // System.out.println(nn);
            n=nn;
            if(map.contains(nn))
            {
                return false;
            }else
                map.add(nn);
        }
        return true;
    }
}
