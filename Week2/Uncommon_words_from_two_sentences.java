class Solution {
    public String[] uncommonFromSentences(String A, String B) 
    {
        HashMap<String,Integer> map=new HashMap<>();
        String[] str1=A.split(" ");
        String[] str2=B.split(" ");
        ArrayList<String> list=new ArrayList<>();
        
        for(int i=0;i<str1.length;i++)
        {
            if(map.containsKey(str1[i]))
            {
                map.put(str1[i],map.get(str1[i])+1);
            }else
            map.put(str1[i],1);
        }
        
        for(int i=0;i<str2.length;i++)
        {
            if(map.containsKey(str2[i]))
            {
                map.put(str2[i],map.get(str2[i])+1);
            }else
            map.put(str2[i],1);
        }
        
        for (Map.Entry<String,Integer> entry : map.entrySet()) 
        {
            
            if(entry.getValue()==1)
            {
                list.add(entry.getKey());
            }
   
        }
        String ans[]=new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        
        return ans;
                   
    }
}