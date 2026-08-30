class Solution {
    public int minimumDeletions(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int min = 0, max = 0;//Indices
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[max])
                max = i;
            if (nums[i] < nums[min])
                min = i;
        }
        int i = Math.min(min, max);
        int j = Math.max(min, max);
        //Don't Use min =Math.min and same for max it is overwriting the values leads to testcases fails
        int front = j + 1;
        int back = nums.length - i;
        int both = (i + 1) + (nums.length - j);

        return Math.min(Math.min(front, back), both);
    }
}