class Solution {
    public String longestCommonPrefix(String[] nums) {
        Arrays.sort(nums);
        String f=nums[0];
        String l=nums[nums.length-1];

        int i=0;

        while(i<f.length() && i<l.length() && f.charAt(i)==l.charAt(i)){
            i++;
        } 
        return f.substring(0,i);
    }
}