class Solution {
    public int titleToNumber(String s) 
    {
        int ans=0;
     for(int i=0;i<s.length();i++)
     {
         int v=s.charAt(i)-'A';
         ans=(ans*26)+v+1;
     }
        return ans;
    }
}