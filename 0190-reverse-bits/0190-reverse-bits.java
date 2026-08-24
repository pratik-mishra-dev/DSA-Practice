class Solution {
    public int reverseBits(int n) {
        int i=0;
        int j=31;
        while(i<j){
            int imask=1<<i,  jmask=1<<j;
            boolean ion= (n&imask)!=0, jon=(n&jmask)!=0;
            if(ion != jon){// change th bit of both
                n^=imask; n^=jmask;
            }
            i++;
            j--;
        }
        return n;
    }
}