class Solution {
    public int[][] merge(int[][] intervals) 
    {
        if(intervals.length==0)
            return intervals;
     Arrays.sort(intervals,(i1,i2) -> Integer.compare(i1[0],i2[0]));
        ArrayList<Pair> list=new ArrayList<>();
        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(e>=intervals[i][0])
            {
                if(e<=intervals[i][1])
                e=intervals[i][1];
            }
            else
            {
                list.add(new Pair(s,e));
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }
        list.add(new Pair(s,e));
        int ans[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            ans[i][0]=(int)list.get(i).getKey();
            ans[i][1]=(int)list.get(i).getValue();
            
        }
        return ans;
    }
}