class Solution {
    public boolean isPowerOfTwo(int n) {
        int x=0;
        double y=0;
        while(y<n){
            y=Math.pow(2,x);
            if(y==n) return true;
            x++;
        }
        return false;
    }
}