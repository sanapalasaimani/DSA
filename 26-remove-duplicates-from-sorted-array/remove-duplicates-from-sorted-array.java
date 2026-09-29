class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int i=0,j=i+1;

        while(j<nums.length){
            while(j<nums.length && nums[i]==nums[j]) j++;
            if(j<nums.length) nums[i+1]=nums[j];
            i++;
        }
        return i;
    }
}