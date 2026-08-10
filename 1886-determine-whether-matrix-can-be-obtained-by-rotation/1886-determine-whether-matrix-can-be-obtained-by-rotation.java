class Solution {
    public void rotate(int[][] matrix) {
     int m=matrix.length;
        
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        } 
         for(int i=0;i<m;i++){
                int j=0,k=m-1;
                while(j<k){
                    int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
             }
        }
        }

    public boolean findRotation(int[][] mat, int[][] target) {
        int m=mat.length;
        
        for(int a=0;a<4;a++){
            boolean flag=true;
            for(int i=0;i<m && flag;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=target[i][j]){
                    flag=false;
                    break;
                }
                
            }
         
        }
        
        if(flag) return true;
        rotate(mat);
        }
        return false;
    }
}