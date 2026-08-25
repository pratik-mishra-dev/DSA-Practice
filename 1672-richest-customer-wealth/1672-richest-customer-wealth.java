class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int n=accounts[0].length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<m;i++){
            int now=0;
            for(int j=0;j<n;j++){
                now+=accounts[i][j];
            }
            max=Math.max(max,now);
        }
        return max;
    }
}