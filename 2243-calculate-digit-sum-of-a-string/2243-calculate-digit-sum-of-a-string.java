class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        if(n<=k) return s;

        while(s.length()>k){
            String ans="";
            int count=0;
            int sum=0;
            for(int i=0;i<s.length();i++){
                count++;
                sum+=Integer.parseInt(""+s.charAt(i));

                if(count==k){
                    ans+=sum;
                    count=0;
                    sum=0;
                }

            }
            if(count>0){
                ans+=sum;
            }
            s=ans;

        }
        return s;
    }
}