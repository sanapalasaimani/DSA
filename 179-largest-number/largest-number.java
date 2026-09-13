class Solution {
    public String largestNumber(int[] nums) {
        String[] val= new String[nums.length];
        for(int i=0;i<nums.length;i++) val[i]=String.valueOf(nums[i]);
        //Custom Sort is very important
        Arrays.sort(val,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++) sb.append(val[i]);
        return (sb.charAt(0)=='0') ? "0":sb.toString();
    }
}