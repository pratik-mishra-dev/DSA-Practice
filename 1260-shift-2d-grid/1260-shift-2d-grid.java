class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    int m=grid.length;
    int n=grid[0].length;
        int[][] ans=new int[m][n];

        for(int a=0;a<k;a++){
            for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) ans[i][j]=grid[m - 1][n - 1];
                else if(j==0) ans[i][0]=grid[i-1][n - 1];
                else ans[i][j]= grid[i][j-1];

            }
        }
        grid=ans;
         ans = new int[m][n]; 
        }
        List<List<Integer>>f_ans=new ArrayList<>();

        for(int i=0;i<m;i++){
            List<Integer>l=new ArrayList<>();
            for(int j=0;j<n;j++){
                l.add(grid[i][j]);
            }
            f_ans.add(l);
        }
        return f_ans;
    }
}