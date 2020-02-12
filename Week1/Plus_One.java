class Solution {
    public int[] plusOne(int[] digits) 
    {
     int[] ans=new int[digits.length+1];
        int carry=1;
        int k=digits.length;
        for(int i=digits.length-1;i>=0;i--)
        {
            int sum=digits[i]+carry;
            digits[i]=(digits[i]+carry)%10;
            carry=sum/10;            
            ans[k--]=digits[i];
        }
        if(carry==0)
        {
            return digits;
        }
        ans[0]=carry;
        return ans;
    }
}