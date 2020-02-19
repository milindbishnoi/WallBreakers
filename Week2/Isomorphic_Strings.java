class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
       int map[]=new int[256];
        int mapp[]=new int[256];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            int s1=s.charAt(i);
            int t1=t.charAt(i);
            if(mapp[t1]==0)
                mapp[t1]=s1;
            else if(mapp[t1]!=s1)
                return false;
            if(map[s1]==0)
                map[s1]=t1;
            else if(map[s1]!=t1)
            {
                return false;
            }
        }
        return true;
    }
}
