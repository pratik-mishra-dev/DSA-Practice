class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int x=n;
            int product=1;
            while(n>0){
                product=product*(n%10);
                n/=10;
            }
            if(product%t==0) return x;
            n=x+1;

        }
    }
}