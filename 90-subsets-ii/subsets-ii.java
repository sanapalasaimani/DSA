import java.util.HashSet;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);// it ensures [1,4,4]=[4,1,4]
        HashSet<List<Integer>> set=new HashSet<>();
        generate(nums,set,new LinkedList<>(),0);
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
    static void generate(int[] nums,HashSet<List<Integer>> set,LinkedList<Integer> temp,int index){
        if(index==nums.length){
            set.add(new LinkedList<>(temp));
            return;
        }
        temp.add(nums[index]);
        generate(nums,set,temp,index+1);
        temp.removeLast();
        generate(nums,set,temp,index+1);
    }
}