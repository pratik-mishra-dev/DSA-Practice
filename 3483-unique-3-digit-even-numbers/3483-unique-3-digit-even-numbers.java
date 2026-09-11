class Solution {
    public int totalNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i) continue;
                    for(int k=0;k<n;k++){
                         if(k==i ||k==j) continue;
                        if(nums[k]%2==0){
                            int num = nums[i] * 100+ nums[j] * 10+ nums[k];
                            if(num>99 && num<1000) set.add(num);
                        }
                    }
            }
        }
        return set.size();

    }
}