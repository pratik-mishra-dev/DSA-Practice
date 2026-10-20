class Solution {
    public boolean helper(int[] nums,int[] arr,int j,int k){
        StringBuilder nonsort = new StringBuilder();
        StringBuilder sort = new StringBuilder();

        for(int i=j;i<j+k;i++){
            nonsort.append(nums[i]).append(" ");
            sort.append(arr[i]).append(" ");
        }

        sort.append(sort);

         return sort.indexOf(nonsort.toString()) != -1;
    }
    public int sortableIntegers(int[] nums) {
        int n=nums.length;

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=nums[i];

        Arrays.sort(arr);
        int ans=0;

        for(int k=1;k<=n;k++){
            if(n%k!=0) continue;

            boolean flag=true;
            for(int j=0;j<n;j+=k){
                boolean check=helper(nums,arr,j,k);
                if(check==false){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans+=k;
            }

        }
        return ans;
    }
}