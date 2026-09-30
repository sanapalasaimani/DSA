import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> l=new LinkedList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int ps=intervals[i][0];
            if(ps>end){
                l.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }else{
                end=Math.max(end,intervals[i][1]);
            }
        }
        l.add(new int[]{start,end});
        int[][] res =l.toArray(new int[0][]);
        return res;
    }
}