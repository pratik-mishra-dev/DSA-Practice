class Solution {
    public int minBitFlips(int start, int goal) {
        int n=start ^ goal;
        //count how many 1
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}