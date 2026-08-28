class Solution {
    public List<Integer> lexicalOrder(int n) {
       List<String> res=new ArrayList<>();
       for(int i=n;i>=1;i--){
        res.add(String.valueOf(i));
       }
       Collections.sort(res);
       List<Integer> ans=new ArrayList<>();
       for(String m:res) ans.add(Integer.parseInt(m));
       return ans;
    }
}