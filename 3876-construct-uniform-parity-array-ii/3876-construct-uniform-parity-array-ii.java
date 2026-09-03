class Solution {
    public boolean uniformArray(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        boolean x=true;
        for(int i=0;i<n;i++){
             min=Math.min(min,nums[i]);

            if(nums[i]%2!=0){
                x=false;
            }
        }
        return x||min%2==1;
    }
}