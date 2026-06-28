class Solution {
    public void swap(int a,int b,char[] arr){
        char temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            char c=arr[i];
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                while(j>i){
                    char c1=arr[j];
                    if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'||c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U')
                        break;
                    j--;
                }
                swap(i,j,arr);
                j--;
            }
            i++;
        }
        return new String(arr);
    }
}