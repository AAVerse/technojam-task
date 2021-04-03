class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int nor = matrix.length;
        int noc = matrix[0].length;
        int column = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0;i < nor;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<noc;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    column = j;
                }
            }
            int max = Integer.MIN_VALUE;
            for(int k = 0;k<nor;k++){
                if(matrix[k][column]>max){
                    max = matrix[k][column];
                }
            }
            if(min==max){
                al.add(min);
            }
        }
        return al;
    }
}
