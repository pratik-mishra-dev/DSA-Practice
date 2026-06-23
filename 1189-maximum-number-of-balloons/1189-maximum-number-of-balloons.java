class Solution {
    public int maxNumberOfBalloons(String text) {
        int n=text.length();
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=text.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else map.put(ch,1);
        }

            String s="balloon";
            int min=Integer.MAX_VALUE; 
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                int x=map.getOrDefault(ch,0);
                
               if(ch=='l'|| ch=='o') x=x/2;
               
                min=Math.min(min,x);
            }
        return min;
    }
}