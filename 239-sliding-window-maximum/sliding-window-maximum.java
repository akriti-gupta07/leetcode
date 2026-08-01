import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || nums.length == 0)
            return new int[0];

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        // Stores indices
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove indices that are outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove all smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Start recording answers once the first window is complete
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}