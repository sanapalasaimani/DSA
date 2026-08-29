class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        //All rotations 0,90,180,270
        //k=0 checks at 0 degree rotation where it is a 360 degree too
        //k=1 when k=0 completes it will be 90 degree completed so on when k=3 it checks for 270 degree which done byt k=2.
        for(int k=0;k<4;k++){
            if(Arrays.deepEquals(mat,target)) return true;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
            //Reverse
            for(int i=0;i<n;i++){
                for(int j=0;j<n/2;j++){
                    int temp=mat[i][j];
                    mat[i][j]=mat[i][n-j-1];
                    mat[i][n-j-1]=temp;
                }
            }
        }
        return false;
    }
}