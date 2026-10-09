class Solution {
    public int minInsertions(String s) {
        int open=0;
        int required=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='(') open++;
            else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                         if(open>0){
                            open--;
                         }
                         else required++;

                         i++;
                    }
                    else{
                        if(open>0) {
                            required++;
                            open--;
                        }
                        else required+=2;
                    }
            }
        }
        return required+(open*2);
    }
}