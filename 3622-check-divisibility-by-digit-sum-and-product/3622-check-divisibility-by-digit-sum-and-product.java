class Solution {
    public boolean checkDivisibility(int n) {
        int k=n;
        int sum=0;
        int product=1;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n/=10;
        }
        int ans=k%(sum+product);
        return ans==0;
    }
}