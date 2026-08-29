class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length) return new int[][]{};
        int[][] res=new int[m][n];
        for(int i=0;i<m*n;i++){
            int row=i/n;
            int col=i%n;
            res[row][col]=original[i];
        }
        return res;
    }
}