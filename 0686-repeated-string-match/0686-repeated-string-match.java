class Solution {
    public int repeatedStringMatch(String a, String b) {
        double countTrial = ((double)b.length()) / a.length();
        int count=(int) countTrial;
        if(countTrial>count) count++;

       StringBuilder sb=new StringBuilder();
       for(int i=0;i<count;i++){
        sb.append(a);

       }

       if(sb.toString().contains(b)) return count;

       sb.append(a);

       if(sb.toString().contains(b)) return count+1;

       return -1;
    }
}