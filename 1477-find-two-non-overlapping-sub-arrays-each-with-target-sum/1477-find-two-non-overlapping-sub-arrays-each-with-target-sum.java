class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int sum=0;
        int i=0;

        int[] brr=new int[n];
        Arrays.fill(brr,Integer.MAX_VALUE);
        
        int ans=Integer.MAX_VALUE;
        int minlen=Integer.MAX_VALUE;

        for(int j=0;j<n;j++){
            sum+=arr[j];

            while(sum>target){
                sum-=arr[i];
                i++;
            }

            if(sum==target){
                int len=j-i+1;

                if(i>0 && brr[i-1]!=Integer.MAX_VALUE){
                    ans=Math.min(ans,len+brr[i-1]);
                }
                minlen=Math.min(minlen,len);
            }
            brr[j]=minlen;
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}