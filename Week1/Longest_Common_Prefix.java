class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==0)//dont forget this case
            return "";
        int min=Integer.MAX_VALUE;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(min>strs[i].length())
            {
                min=strs[i].length();
                j=i;
            }
        }
        String ans="";
        for(int i=0;i<strs[j].length();i++)
        {
            char c=strs[j].charAt(i);
            for(int m=0;m<n;m++)
            {
                if(strs[m].charAt(i)!=c)
                {
                   return ans; 
                }
                
            }
                ans+=c;
        }
        return ans;
    }
}