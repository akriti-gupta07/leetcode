class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap <Integer,Integer> maps =new HashMap<>();
        int psum=0;
        int count=0;
        maps.put(0,1);
        for(int i=0;i<nums.length;i++){
            psum=psum+nums[i];
            if(maps.containsKey(psum-goal)){
                count+=maps.get(psum-goal);

            }
            maps.put(psum,maps.getOrDefault(psum,0)+1);

        }
        return count;
        
    }
}