class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] res=new int[nums.length];
       int low=0,high=nums.length-1;
       int idx=high;
       while(low<=high){
        if(nums[low]*nums[low]>nums[high]*nums[high]){
            res[idx--]=nums[low]*nums[low];
            low++;
        }else{
            res[idx--]=nums[high]*nums[high];
            high--;}
       }
       return res;
    }
}