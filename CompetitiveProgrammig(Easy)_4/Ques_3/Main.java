package com.company;
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int answer[] =new int[t];
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int ar[] = new int[n];
            int even = 0, odd = 0;
            for(int j=0;j<n;j++){
                ar[j]=sc.nextInt();
                if(ar[j]%2==0){
                    even += 1;
                }
                else{
                    odd += 1;
                }
            }
            if(odd>=even){
                answer[i]=even;
            }
            else{
                answer[i]=-1;
            }
        }
        for(int i=0;i<t;i++){
            System.out.println(answer[i]);
        }
    }
}
