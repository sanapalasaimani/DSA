class Solution {
    public String largestNumber(int[] nums) {
        String[] nums1=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            nums1[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(nums1,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++) sb.append(nums1[i]);
        return sb.charAt(0)=='0'?"0":sb.toString();
    }
}