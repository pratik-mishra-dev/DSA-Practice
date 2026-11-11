class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans=0;
        if(cost1+cost2<=costBoth){
            ans+=(long)cost1*need1 + (long)cost2*need2;
            return ans;
        }
        int common=Math.min(need1,need2);
        ans+=(long)common*costBoth;

        need1-=common;
        need2-=common;

        if(need1!=0){
            if(cost1<=costBoth){
            ans+=(long)cost1*need1;
            return ans;
        }
        else ans+=(long)need1*costBoth;
        }
        else if(need2!=0){

            if(cost2<=costBoth){
            ans+=(long)cost2*need2;
            return ans;
        }
        else ans+=(long)need2*costBoth;
        }
    return ans;

    }
}