class Solution {
    public boolean canAliceWin(int n) {
       int cur=10;
       int step=0;
    for(int i=0;i<100000;i++){
        for(int j=0;j<1000;j++){
        
    }
    }
       while(n>=cur){
        n-=cur;
        cur--;
        step++;
       }
       if(step%2==0) return false;
       return true;

    }
}