package com.company;
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int sum = 0;
        for(int i = 0;i < n;i++){
            ar[i]=sc.nextInt();
            int c = 0;
            for(int j =1;j<=ar[i];j++){
                if(ar[i]%j==0){
                    c += 1;
                }
            }
            if(c==2){
                sum += ar[i];
            }
        }
        int arr[] = new int[10];
        while(sum!=0){
            int r = sum%10;
            arr[r]++;
            sum=sum/10;
        }
        for(int i=0;i<10;i++){
            if(arr[i]>1){
                System.out.println("No");
                break;
            }
            if(i==9){
                System.out.println("Yes");
            }
        }
    }
}
