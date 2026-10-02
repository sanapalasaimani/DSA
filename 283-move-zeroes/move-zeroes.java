class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if(i==j && nums[i]!=0){i++; }
            else if(nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                i++;

            }
          j++;
        }
    }
}