class Solution {
    public String largestOddNumber(String nums) {
        int n=nums.length();
        String ans="";
        int i=n-1;
        while(i>=0){
            char c=nums.charAt(i);
            if(c=='1'||c=='3'||c=='5'||c=='7'||c=='9'){
                ans=nums.substring(0,i+1);
                return ans;
            }
            i--;
        }
        return ans;
    }
}