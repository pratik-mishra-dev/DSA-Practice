class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
       int start=nums[0];
       int end=nums[n-1];
       int i=1;
       while(start!=end){
        if(i<n && nums[i]==start+1){
             i++;
             start++;
        }
        else{
            l.add(start+1);
            start++;
        }
       }
        return l;
    }
}