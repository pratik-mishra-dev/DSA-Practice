class Solution {
    private int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        arr[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>max) max=nums[i];
            arr[i]=gcd(nums[i],max);
        }

        Arrays.sort(arr);

        int k=n/2;
        long value=0;
        int i=0,j=n-1;
        while(i<k){
            value+=gcd(arr[i],arr[j]);
            i++;
            j--;
        }
        return (long)value;
    }
}