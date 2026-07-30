class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        for (int r=0;r<nums.length;r++){
            sum=sum+nums[r];
            while(sum>= target){
                minlen=Math.min(minlen,r-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return (minlen==Integer.MAX_VALUE?0:minlen);
    }
}