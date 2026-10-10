class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int max=0;
        
        int[] difference=new int[100000+1];

        for(int i=0;i<n;i++){
            int x=Math.abs(nums1[i]-nums2[i]);
            difference[x]++;
            if(x>max) max=x;
        }

        long k=(long)k1+k2;
       
       for(int i=max;i>0 && k>0;i--){
            long currOpp=Math.min(difference[i],k);

            difference[i]-=currOpp;
            difference[i-1]+=currOpp;

            k-=currOpp;
       }
        long ans=0;

       for(int i=1;i<=max;i++){
        ans+=(long)i*i*difference[i];
       }

       return ans;
    }
}