class Solution {
    int[][] dp;
    public int helper(int n,int[] copies,int[][] items,int budget,int min){
        if(n==0){
            return budget/min;
        }
        if(dp[n][budget]!=-1) return dp[n][budget];

        int take=0;
        int price=items[n-1][1];
        if(budget>= price) take=1+copies[n-1]+helper(n-1,copies,items,budget-price,min);

        int not_take=helper(n-1,copies,items,budget,min);

        return dp[n][budget]=Math.max(take,not_take);



    }
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;

        int[] copies=new int[n];
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            min=Math.min(min,items[i][1]);

            for(int j=0;j<n;j++){
                if(i==j) continue;

                if(items[j][0] % items[i][0]== 0) copies[i]++;
            }
        }
        dp=new int[1001][1501];
        for(int i=0;i<1001;i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(n,copies,items,budget,min);
    }
}