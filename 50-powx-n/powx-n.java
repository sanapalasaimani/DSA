class Solution {
    public double myPow(double x, int n) {
        if(n<1){x=1/x; n=-n;}
        double pow=1;
        while(n!=0){
            if((n&1)!=0){
                pow*=x;
                n=n-1;
            }else{
                x*=x;
                n>>>=1;
            }
        }
        return pow;
    }
}