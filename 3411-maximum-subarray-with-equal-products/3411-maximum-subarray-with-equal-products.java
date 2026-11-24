class Solution {
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans=0;

        for(int i=0;i<n;i++){
            int product=1;
            int gcd=0;
            int lcm=1;

            for(int j=i;j<n;j++){
                product*=nums[j];
                gcd=gcd(gcd,nums[j]);

                lcm = (lcm / gcd(lcm, nums[j])) * nums[j];
                if(product == gcd * lcm) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
           
        }
         return ans;
    }
}