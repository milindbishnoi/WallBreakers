class Solution {
    public static class triplet
    {
        char c;
        int min;
        int max;
        triplet()
        {
            c='-';
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
        }
    }
    public List<Integer> partitionLabels(String s) 
    {
        int n=s.length();
        triplet[] t=new triplet[27];
        for(int i=0;i<27;i++)
           t[i]=new triplet();
        for(int i=0;i<n;i++)
        {
            //System.out.println(s.charAt(i));
          //  t[i]=new triplet();
            t[s.charAt(i)-'a'].c=s.charAt(i);
            t[s.charAt(i)-'a'].max=Math.max(t[s.charAt(i)-'a'].max,i);
            t[s.charAt(i)-'a'].min=Math.min(t[s.charAt(i)-'a'].min,i);
        }
         // for(int i=0;i<26;i++)
         //    System.out.println(t[i].c+" "+t[i].min+" "+t[i].max);
        Arrays.sort(t,new Comparator<triplet>(){
            @Override
            public int compare(triplet t1,triplet t2)
            {
                if(t1.min>t2.min)
                    return 1;
                else if(t1.min==t2.min)
                    return 0;
                else 
                    return -1;
            }
        });
        
        int b=t[0].min;
        int e=t[0].max;
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<27;i++)
        {
            if(t[i].c!='-'){
            if(t[i].min<e)
            {
                if(t[i].max>e)
                    e=t[i].max;
            }else 
            {
                list.add(e-b+1);
                b=t[i].min;
                e=t[i].max;
                
            }}
        }
        list.add(e-b+1);
        return list;
    }
}