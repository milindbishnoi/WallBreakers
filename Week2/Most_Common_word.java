class Solution {
    public String mostCommonWord(String paragraph, String[] banned) 
    {
     HashMap<String,Integer> map=new HashMap<>();
     Set<String> set=new HashSet<>();
     for(int i=0;i<banned.length;i++)
     {
         set.add(banned[i]);
        // System.out.println(banned[i]);
     }
     paragraph=paragraph.toLowerCase();
        String Np="";
     for(int i=0;i<paragraph.length();i++)
     {
         if(paragraph.charAt(i)<'a'||paragraph.charAt(i)>'z')
             Np+=' ';
         else
         Np+=paragraph.charAt(i);
     }
        String[] strs=Np.split(" ");
        int max=-1;
        String ans="";
    // System.out.println(Np);
        for(int i=0;i<strs.length;i++)
        {
          //  System.out.println(strs[i]);
            if(strs[i].length()!=0&&!set.contains(strs[i]))
            {
                if(map.containsKey(strs[i]))
                {
                    map.put(strs[i],map.get(strs[i])+1);
                    if(max<=map.get(strs[i]))
                    {
                        max=map.get(strs[i]);
                        ans=strs[i];
                   //    System.out.println(max+" j "+i);
                    }
                }else
                {
                    map.put(strs[i],1);
                     if(max<=1)
                    {
                        max=1;
                        ans=strs[i];
                   //     System.out.println(max+" "+i);
                 //      System.out.println(strs[i]);
                    }
                    
                }
              //   System.out.println(max+" "+i);
                
            }
          
        //    System.out.println(max+" "+i);
        }
    //  System.out.println(max);
        return ans;
         
    }
}