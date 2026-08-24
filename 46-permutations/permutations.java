class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Start the backtracking process from index 0
        backtrack(nums, 0, result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<List<Integer>> result) {
        // Base case: if start reaches the end of the array, we have a complete permutation
        if (start == nums.length) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }

        // Iterate from the 'start' index to the end
        for (int i = start; i < nums.length; i++) {
            
            swap(nums, start, i);
            backtrack(nums, start + 1, result);
            swap(nums, start, i); 
        }
    }

    // Helper method to swap elements in an integer array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}