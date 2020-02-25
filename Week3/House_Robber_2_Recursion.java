class Solution {
    public int rob(int[] nums) 
    {
        int n=nums.length;
        if(nums.length==1)
            return nums[0];
        return Math.max(helper(nums,0,n-1),helper(nums,1,n));
        
    }
    public int helper(int[] nums,int i,int j)
    {
        if(i>=j)
            return 0;
        
        return Math.max(nums[i] + helper(nums,i+2,j),helper(nums,i+1,j));
    }
}