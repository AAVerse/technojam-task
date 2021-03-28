package com.company;
import java.util.*;
class Main{
    static int maxNumbers(int ar[], int n){
        int ans = 0;
        int freq[] = {0,0,0,0};
        for(int i = 0;i<n;i++){
            ar[i] = ar[i]%4;
            freq[ar[i]] += 1;
        }
        ans += freq[0];
        if(freq[1]>=4){
            int x = freq[1]/4;
            ans += x;
            freq[1] -= 4*x;
        }
        if(freq[1]<=freq[3]){
            int x = freq[1];
            ans += x;
            freq[1] -= x;
            freq[3] -= x;
        }
        else if(freq[3]<freq[1]){
            int x = freq[3];
            ans += x;
            freq[1] -= x;
            freq[3] -= x;
        }

        ans += freq[2]/2;
        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println(maxNumbers(ar,n));
    }
}
