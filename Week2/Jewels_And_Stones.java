class Solution {
    public int numJewelsInStones(String J, String S) 
    {
      int map[]=new int[256];
        for(int i=0;i<J.length();i++)
        {
            map[J.charAt(i)]=1;  
        }
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            if(map[S.charAt(i)]==1)
                count++;
        }
        return count;
    }
}