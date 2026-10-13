class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            nums[i]=Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        int i=0,j=n-1;
        long ans=0;
        boolean flag=true;
        while(j>=i){
            if(flag){
                ans+=nums[j]*nums[j];
                j--;
                flag=false;
            }
            else{
                ans-=nums[i]*nums[i];
                i++;
                flag=true;
            }
        }
        return ans;
    }
}