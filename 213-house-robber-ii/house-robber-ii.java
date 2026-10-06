class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n-1];
        int[] arr2=new int[n-1];
        if(n==1){
            return nums[0];

        }
        else if(n==2){
            return Math.max(nums[0],nums[1]);
        }

        else{
            arr1[0]=nums[0];
            arr1[1]=Math.max(nums[0],nums[1]);
            for(int i=2;i<n-1;i++){
                arr1[i]=Math.max(arr1[i-2]+nums[i],arr1[i-1]);

            }
            arr2[0]=nums[1];
            arr2[1]=Math.max(nums[2],nums[1]);
            for(int i=2;i<n-1;i++){
                arr2[i]=Math.max(arr2[i-2]+nums[i+1],arr2[i-1]);

            }
            return Math.max(arr1[n-2],arr2[n-2]);
            

        }

        
    }
}