class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0, odd = 0, count = 0, ans = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 1) {
                odd++;
                count = 0;
            }

            while (odd == k) {
                count++;
                if (nums[left] % 2 == 1)
                    odd--;
                left++;
            }

            ans += count;
        }

        return ans;
    }
}