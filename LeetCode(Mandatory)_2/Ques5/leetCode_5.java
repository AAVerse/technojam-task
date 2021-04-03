class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int l = words.length;
        String[] arr = new String[l];
        String[] givenArray = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for(int i = 0;i<l;i++){
            String current = words[i];
            int l1 = current.length();
            String res="";
            for(int j = 0;j<l1;j++){
                int ch = (int)current.charAt(j);

                int index =  ch-97;
                res = res + givenArray[index];
            }
            arr[i] = res;
        }
        Set<String> resultset = new HashSet<String>();
        for(int i = 0;i<l;i++){
            resultset.add(arr[i]);
        }

        return resultset.size();
    }
}
