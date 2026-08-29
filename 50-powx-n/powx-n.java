class Solution {
    public double myPow(double x, int n) {
        long N=(long) n;
        if(N<0){ N=-N; x=1/x;}
        double pow=1;
        while(N>0){
            if((N&1)==1){
                pow*=x;
                N=N-1;}
            x*=x;
            N=N>>>1;
        }
        return pow;
    }
}