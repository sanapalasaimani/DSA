class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
     /* See we need to get maximum area of cake
       best idea is to calculate maximum height and maximum width
       see simple example if want big piece of cake it should be long and should be maximum width possible.(Calulating for each piece is timetaking and it universally less than maxWidth*maxHeight)
       1) Find maximum height.. will check with adjacent cuts 
       2) Find Maximum width
       */ 
       Arrays.sort(horizontalCuts);
       Arrays.sort(verticalCuts);
       // Initialize with the edge cases: top edge to first cut, and last cut to bottom edge
        long maxH = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        for (int i = 1; i < horizontalCuts.length; i++) {
            maxH = Math.max(maxH, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        long maxW = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);
        for (int i = 1; i < verticalCuts.length; i++) {
            maxW = Math.max(maxW, verticalCuts[i] - verticalCuts[i - 1]);
        }
        return (int) ((maxH * maxW) % 1_000_000_007);
    }
}