class Solution {
    public char findTheDifference(String s, String t) 
    {
        int[] map=new int[256];
        for(int i=0;i<s.length();i++)
            map[s.charAt(i)]++;
        for(int i=0;i<t.length();i++)
            map[t.charAt(i)]--;
        for(int i=0;i<t.length();i++)
            if(map[t.charAt(i)]==-1)
                return t.charAt(i);
        return 'a';
    }
}