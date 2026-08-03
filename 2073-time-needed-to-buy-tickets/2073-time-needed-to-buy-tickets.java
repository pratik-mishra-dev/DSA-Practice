class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int t=0;
        while(tickets[k]!=1){
            for(int i=0;i<n;i++){
                if(tickets[i]==0) continue;
                else{
                    tickets[i]--;
                    t++;
                }
            }
        }
        for(int i=0;i<=k;i++){
                if(tickets[i]==0) continue;
                else{
                    tickets[i]--;
                    t++;
                }
            }
            return t;
    }
}