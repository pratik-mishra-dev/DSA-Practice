class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int m=bookings.length;
        int[] ans=new int[n];
        for(int i=0;i<m;i++){
            int first=bookings[i][0];
            int last=bookings[i][1];
            int value=bookings[i][2];
            ans[first-1]+=value;
            if(last<n) ans[last+1-1]-=value;
        }
        for(int i=1;i<n;i++)
        ans[i]+=ans[i-1];

        return ans;
    }
}