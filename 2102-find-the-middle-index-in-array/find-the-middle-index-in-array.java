class Solution {
    public int findMiddleIndex(int[] nums) {
        
        if (nums.length==1) {
            return 0;
        }

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}