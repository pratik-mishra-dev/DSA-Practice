class Solution {
    private void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        while(j<n){
            if(nums[j]!=0){
                swap(i,j,nums);
                i++;
            }
            j++;
        }
    }
}