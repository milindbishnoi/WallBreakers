class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
        int d5=0;
        int d10=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
                d5++;
            if(bills[i]==10)
            {
                d10++;
                d5--;
            }
            if(bills[i]==20)
            {
                if(d10>0)
                {
                    d10--;
                    d5--;
                }else
                {
                    d5-=3;
                }
            }
            if(d5<0||d10<0)
                return false;
        }
        return true;
    }
}