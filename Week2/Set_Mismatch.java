class Solution {
    public int[] findErrorNums(int[] nums) 
    {
         int n = nums.length;
        int sum = n*(n+1)/2;
        int duplicateNum = 0;
        HashSet<Integer> numSet = new HashSet<>();
        
        for(int num : nums){
            if(numSet.contains(num)){
                duplicateNum = num;
            }
            else{ 
                numSet.add(num);
                sum -= num;
            }
        }
        
        return new int[]{duplicateNum, sum};
    }
}