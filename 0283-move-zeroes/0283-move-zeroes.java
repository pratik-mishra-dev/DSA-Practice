class Solution {
    public void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        while(j<n){
            if(nums[j]!=0){
                swap(i,j,nums);
                i++;
            }
            j++;
        }
    }
}