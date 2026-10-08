class Solution {
    public int maxProduct(int[] nums) {
        int product=nums[0];
        int left=1;
        int right=1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            left *= nums[i];
            right *= nums[n - i - 1];

            product = Math.max(product, Math.max(left, right));

            if (left == 0) left = 1;
            if (right == 0) right = 1;
        }
        return product;



        
    }
}