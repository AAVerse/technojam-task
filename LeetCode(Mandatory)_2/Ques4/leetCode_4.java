class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        String res = "";
        if(l2>l1){
            String remain = word2.substring(l1);
            for(int i=0;i<l1;i++){
                res = res+word1.charAt(i);
                res = res+word2.charAt(i);
            }
            res=res+remain;
            return res;
        }
        else if(l1>l2){
            String remain = word1.substring(l2);
            for(int i=0;i<l2;i++){
                res = res+word1.charAt(i);
                res = res+word2.charAt(i);
            }
            res=res+remain;
            return res;
        }
        else{
            for(int i=0;i<l2;i++) {
                res = res + word1.charAt(i);
                res = res + word2.charAt(i);
            }
            return res;
        }
    }
}
