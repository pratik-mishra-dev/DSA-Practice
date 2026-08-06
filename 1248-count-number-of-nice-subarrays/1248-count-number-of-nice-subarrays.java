class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int count=0;
       
        while(i<n && nums[i]%2!=1)
        i++;

         int odd = 1;
        int j = i + 1;

        while (j < n && odd < k) {
            if (nums[j] % 2 == 1)
                odd++;
            j++;
        }
        j--;

        if (odd < k)
            return 0;

        int a=0,b=j+1;
        b=j+1;
          while(b<n && nums[b]%2!=1) b++;
             b--;

        while(b<n){
            count+=(i-a+1)*(b-j+1);
            a=i+1;
            i++;
            while(i<n && nums[i]%2!=1) i++;
            j=b+1;
            b=j+1;
             while(b<n && nums[b]%2!=1) b++;
             b--;
        }
        return count;
    }
}