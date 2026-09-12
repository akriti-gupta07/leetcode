class Solution {
    public int findPeakElement(int[] nums) {

        int left=0;
        int right=nums.length-1;
        int m=0;
        int large=0;
        while(left<=right){
            m=left+(right-left)/2;
            if(m>0 && nums[m]<nums[m-1]){
                right=m-1;
            }
            else if(m<nums.length-1 && nums[m]<nums[m+1]){
                left=m+1;
            }
            else{
                return m;
            }
        }
        return -1;
        
    }
}