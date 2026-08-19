class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int max = -1;

        // Case 1: The entire array is the only window (appears exactly once)
        if (k == n) {
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }

        // Count overall frequencies (nums[i] <= 50 on LeetCode)
        int[] freq = new int[51];
        for (int num : nums) {
            freq[num]++;
        }

        // Case 2: Window size is 1 -> return max number that appears exactly once
        if (k == 1) {
            for (int i = 50; i >= 0; i--) {
                if (freq[i] == 1) return i;
            }
            return -1;
        }

        // Case 3: 1 < k < n -> Only nums[0] and nums[n - 1] can appear in exactly 1 window
        if (freq[nums[0]] == 1) {
            max = Math.max(max, nums[0]);
        }
        if (freq[nums[n - 1]] == 1) {
            max = Math.max(max, nums[n - 1]);
        }

        return max;
    }
}