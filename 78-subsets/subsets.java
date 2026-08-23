class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        generate(nums, list, new LinkedList<Integer>(), 0);
        return list;
    }

    static void generate(int[] nums, List<List<Integer>> list,LinkedList<Integer> temp, int index) {
        if (index == nums.length) {
            list.add(new LinkedList<>(temp));
            return;
        }

        // Include nums[index]
        temp.add(nums[index]);
        generate(nums, list, temp, index + 1);

        // Backtrack
        temp.remove(temp.size() - 1);

        // Exclude nums[index]
        generate(nums, list, temp, index + 1);
    }
}