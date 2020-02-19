class Solution {
    public static class pair
    {
        char i;
        int j;
        // public pair(char i,int j )
        // {
        //     i=this.i;
        //     j=this.j;
        // }
    }
    public String frequencySort(String s) 
    {
        pair[] p=new pair[256];
        for(int i=0;i<256;i++)
            p[i]=new pair();
        for(int i=0;i<s.length();i++)
        {
            
            p[s.charAt(i)].i=s.charAt(i);
            p[s.charAt(i)].j++;
        //    System.out.println(p[s.charAt(i)].i+" "+p[s.charAt(i)].j);
        }
        Arrays.sort(p,new Comparator<pair>(){
        
            @Override
            public int compare(pair p1,pair p2)
            {
                if(p1.j<p2.j)
                    return 1;
                else if(p1.j==p2.j)
                    return 0;
                else 
                    return -1;
            }
        });
  //      System.out.println(p[0].i+" "+p[0].j);
        String sol="";
        int j=0;
        while(p[j].j!=0)
        {
            while(p[j].j!=0)
            {sol+=p[j].i;p[j].j--;}
            
            j++;
        }
        return sol;
    }
}