import java.util.Scanner;
class Solution {
    public int xorOperation(int n, int start) {
        int res = 0;
        int nums[] = new int[n];
        for(int i = 0;i<n;i++){
            nums[i]=start+2*i;
            res = res^nums[i];
        }
        return res;
    }
    public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        System.out.println(xorOperation(n, start));
    }
}
