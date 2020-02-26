class Solution {
    public int search(int[] nums, int target) 
    {
        int b=0;
        int e=nums.length-1;
        while(b<=e)
        {
            int m=(b+e)/2;
            if(nums[m]==target)
                    return m;
            else if(nums[m]<target)
                b=m+1;
            else 
                e=m-1;
        }
        return -1;
    }
}