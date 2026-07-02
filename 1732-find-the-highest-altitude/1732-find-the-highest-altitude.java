class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int at_that_moment=0;
        for(int i=0;i<gain.length;i++){
            at_that_moment+=gain[i];
           max=Math.max(max,at_that_moment);
        }
        return max;
    }
}