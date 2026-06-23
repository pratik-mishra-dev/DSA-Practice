class Solution {
    public void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public String removeStars(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        int i=-1,j=0;
        while(j<n){
            char ch=arr[j];
            if(ch=='*'){
                if(i>=0)i--;
                j++;
            }
            else{
                i++;
                swap(arr,i,j);
                j++;
            }
        }
        String ans="";
        for(int a=0;a<=i;a++)
        ans+=arr[a];

        return ans;
    }
}