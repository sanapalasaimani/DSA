class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int r=matrix.length,c=matrix[0].length;
        for(int i=0;i<r;i++){
            int min=Integer.MAX_VALUE;
            int minIndex=0;
            for(int j=0;j<c;j++){
               if(min>matrix[i][j]){
                 min=matrix[i][j];
                 minIndex=j;
               }
            }
            int max=Integer.MIN_VALUE;
            for(int k=0;k<r;k++){
                if(max<matrix[k][minIndex]) max=matrix[k][minIndex];
            }
            if(min==max){
                list.add(max);
                break;
            }
            
        }
        return list;
    }
}