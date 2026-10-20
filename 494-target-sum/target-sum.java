class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int x=solve(nums,0,0,target);
        return x;

        
    }
    public int solve(int[]nums,int i,int sum,int target){
        if(i==nums.length){
            return (sum==target)?1:0;
        }
        int add = solve(nums,i+1,sum+nums[i],target);
        int minus = solve(nums,i+1,sum-nums[i],target);
        return add+minus;
    }
}