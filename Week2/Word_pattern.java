class Solution {
    public boolean wordPattern(String pattern, String str) 
    {
        HashMap<String,String> map=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        String[] strs=str.split(" ");
        if(pattern.length()!=strs.length)
        {
            return false;
        }else
        {
            for(int i=0;i<pattern.length();i++)
            {  
                if(map.containsKey(pattern.charAt(i)+""))
                {
                    if(map.get(pattern.charAt(i)+"").equals(strs[i]))
                    {}
                    else 
                        return false;
                    
              
                }else
                {
                    map.put(pattern.charAt(i)+"",strs[i]);
                 
                }
                
                if(map2.containsKey(strs[i]))
                {
                    
                    if(map2.get(strs[i])==(pattern.charAt(i)))
                        {}
                    else 
                        return false;
                }else
                {
                    map2.put(strs[i],pattern.charAt(i));
                }
            }
        }
        return true;
    }
}
