class Solution {
    public int numSpecialEquivGroups(String[] A) 
    {
        HashMap<String ,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++)
        {
            int preE[]=new int[27];
            int preO[]=new int[27];
            for(int j=0;j<A[i].length();j++)
            {
                if(j%2==0)
                    preE[A[i].charAt(j)-(int)'a']++;
                else
                    preO[(A[i].charAt(j))-(int)'a']++;
            }
            String str=Arrays.toString(preE)+Arrays.toString(preO);
            if(map.containsKey(str))
                map.put(str,map.get(str)+1);
            else
                map.put(str,1);
            
        }
        return map.size();
    }
}