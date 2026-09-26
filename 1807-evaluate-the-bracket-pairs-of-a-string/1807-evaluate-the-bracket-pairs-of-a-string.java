class Solution {
    public String evaluate(String s, List<List<String>> l) {
        int n=s.length();
        HashMap<String,String> map=new HashMap<>();

        for(List<String> temp: l){
            map.put(temp.get(0),temp.get(1));
        }

        String ans="";
        
        int i=0;
        while(i<n){
            char c=s.charAt(i);

            if(c=='('){
                String check="";
                i++;
                while(s.charAt(i)!=')'){
                   check+=s.charAt(i);
                   i++; 
                }
                if(map.containsKey(check)){
                    ans+=map.get(check);
                }
                else ans+='?';
            }
            else ans+=c;

            i++;
        }
        return ans;

    }
}