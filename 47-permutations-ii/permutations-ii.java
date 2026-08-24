import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // HashSet doesn't require a comparator and handles uniqueness perfectly
        Set<List<Integer>> set = new HashSet<>();
        
        backtrack(nums, 0, set);
        
        // Convert the HashSet back into a List of Lists
        return new ArrayList<>(set);
    }

    private void backtrack(int[] nums, int start, Set<List<Integer>> set) {
        if (start == nums.length) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            set.add(currentPermutation);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(nums, start + 1, set);
            swap(nums, start, i); 
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}