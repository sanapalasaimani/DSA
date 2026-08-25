import java.util.HashSet;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums) set.add(n);
        int c=1;
        while(true){
        int temp=k*c;
        if(!set.contains(temp)) return temp;
        c++;
        }
    }
}