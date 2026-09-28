class Solution {
    public int[] plusOne(int[] digits) {
        int c=0;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
                c=1;
            }else if(digits[i]<9){
                digits[i]+=1;
                c=0;
                break;
            }
            }
        
        if(c==0) return digits;
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
    }
}