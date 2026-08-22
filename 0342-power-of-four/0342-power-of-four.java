class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n<=0 || n%4!=0) return false;
        for(int i=0;i<=31;i+=2){
            int y=1<<i;
            if(y==n) return true;
        }
        return false;
        
    }
}