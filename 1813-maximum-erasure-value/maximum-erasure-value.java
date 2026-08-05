class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int[] arr= new int[10001];
        int l=0;
        int sum=0;
        int max=0;
        for(int r=0;r<nums.length;r++){
            
            while(arr[nums[r]]>0){
                
                sum=sum-nums[l];
                arr[nums[l]]--;
                l++;
            }
            if(arr[nums[r]]==0){
                arr[nums[r]]++;
                sum=sum+nums[r];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}