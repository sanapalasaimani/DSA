class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int area=0;
        while(l<=r){
          int ht=Math.min(height[l],height[r]);
          area=Math.max(area,ht*(r-l));
          if(height[l]>height[r]) r--;
          else l++;
        }
        return area;
    }
}