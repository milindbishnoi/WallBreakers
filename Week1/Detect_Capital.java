class Solution {
    public boolean detectCapitalUse(String s) 
    {
     boolean ans=false;
        int u=0;
        int l=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
          if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
              u++;
          if(s.charAt(i)>='a'&&s.charAt(i)<='z')
              l++;
        }
        if(l==n)
            return true;
        if(u==n)
            return true;
        if(u==1&&s.charAt(0)>='A'&&s.charAt(0)<='Z')
            return true;
        return false;
    }
}