class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int f=0;
        int s=1;
        for(int i=1;i<n;i++){
            int temp=s;
            s=s+f;
            f=temp;
        }
        return s;
    }
}