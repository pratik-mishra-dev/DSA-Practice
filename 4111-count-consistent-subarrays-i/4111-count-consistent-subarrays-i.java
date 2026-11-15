class Solution {
    public int countConsistent(int[] nums) {
        int n=nums.length;

        int ans=n;

        for(int i=0;i<n;i++){
            int min=nums[i];
            int ope=nums[i];
            for(int j=i+1;j<n;j++){
                if(min>nums[j]) min=nums[j];
                ope=ope & nums[j];
                if(ope==min) ans++;
            }
        }
        return ans;
    }
}