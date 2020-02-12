class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        
        }
        for(int i=0;i<nums.length;i++)
        {
            int c = target-nums[i];
           
            if(map.containsKey(c)&&map.get(c)!=i)
            {
                int[] a = new int[2];
                a[0]=i;
                a[1]=map.get(c);
                return a;
            }
        }
        return new int[0];
    }
}