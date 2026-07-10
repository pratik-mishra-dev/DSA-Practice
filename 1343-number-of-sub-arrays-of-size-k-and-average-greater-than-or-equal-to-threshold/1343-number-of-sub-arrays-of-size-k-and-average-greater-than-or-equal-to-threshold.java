class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int sum=0;

        for(int i=0;i<k;i++)
        sum+=arr[i];

        int count=0;

        int avg=sum/k;
        if(avg>=threshold) count++;
        int i=1,j=k;

       while(j<n){
        sum=sum-arr[i-1]+arr[j];
        avg=sum/k;
        if(avg>=threshold) count++;
        i++;
        j++;
       }
        return count;
    }
}