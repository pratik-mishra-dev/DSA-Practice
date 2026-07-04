class Solution {
    public int bestClosingTime(String customers) {
        int n=customers.length();
        int[] prif=new int[n+1];
        int[] suf=new int[n+1];// to calculate 0 hour
        for(int i=1;i<=n;i++){
            prif[i]+=prif[i-1];
            if(customers.charAt(i-1)=='N') prif[i]++;
        }
        for(int i=n-1;i>=0;i--){
            suf[i]+=suf[i+1];
            if(customers.charAt(i)=='Y') suf[i]++;
        }
            int min=n+6;//greater than n+1 any no
        for(int i=0;i<=n;i++){
            prif[i]+=suf[i];
            min=Math.min(min,prif[i]);
        }
        for(int i=0;i<=n;i++){
            if(prif[i]==min) return i;
        }
        return 0;
    }
}