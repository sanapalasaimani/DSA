class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        // As problem statement says its circular subarray. we iterate 2*n times
        int[] res=new int[nums.length];
        Arrays.fill(res,-1); // --> Helps when no greater element not there
        for(int i=0;i<2*nums.length;i++){
            int current=i%nums.length;
            while(!stack.isEmpty() && nums[stack.peek()]<nums[current]) res[stack.pop()]=nums[current];
            if(i<nums.length) stack.push(i); // works for single pass
        }
        return res;
    }
}