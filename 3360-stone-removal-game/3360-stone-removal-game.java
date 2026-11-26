class Solution {
    public boolean canAliceWin(int n) {
       int cur=10;
       int step=0;
       while(n>=cur){
        n-=cur;
        cur--;
        step++;
       }
       if(step%2==0) return false;
       return true;

    }
}