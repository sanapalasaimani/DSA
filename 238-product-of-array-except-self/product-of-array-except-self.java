class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] suffix=new int[nums.length]; suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        
        int prefixp=1;
        for(int i=0;i<nums.length;i++){
            suffix[i]*=prefixp;
            prefixp*=nums[i];
        }
        return suffix;
    }
}