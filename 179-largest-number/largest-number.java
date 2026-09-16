class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(a+b).compareTo(b+a));
        String str="";
        boolean flag = true;
        for(int i=arr.length-1;i>=0;i--){if(!arr[i].equals("0"))flag = false;
        str=str+arr[i];}
        //long res = Long.parseLong(str);
        return flag?"0":str; 
         
    }
}