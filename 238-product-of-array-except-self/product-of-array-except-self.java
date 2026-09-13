class Solution {
    public int[] productExceptSelf(int[] nums) {
        // original=[1,2,3,4]
        // prefix=[1,1,2,6]
        // suffix=[24,12,4,1]
        //p=[1,-1,-1,0,0]
        //s=[0,0,-9,3,1]
        //[24,24,12,4] total product=24;
        int[] suffix=new int[nums.length];
        suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        int pref=1;
        // [24,1*1*12,1*2*4,2*3*1]
        for(int i=1;i<nums.length;i++){
           pref*=nums[i-1];
           suffix[i]*=pref;
        }
        return suffix;
    }
}