class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
     Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i]))
            {
                set2.add(nums2[i]);
            }
        }
        int ans[]=new int[set2.size()];
        int i=0;
        for (Integer s : set2) 
        {
         ans[i]=s;
            i++;
        } 
        return ans;
    }
}