package com.company;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String opponents[] = {"Tywin", "Hound", "Jaime", "The Mountain"};
        String answer[] = new String[t];
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            String binSt = sc.next();
            int l = binSt.length();
            int one=0, zero=0;
            for(int j = 0;j<l;j++){
                char c = binSt.charAt(j);
                if(c == '1'){
                    one += 1;
                }
                else if(c == '0'){
                    zero += 1;
                }
            }
            if(zero>one){
                int x = (zero-one)%4;
                answer[i]=opponents[x];
            }
            else if(one>zero){
                int x =  4-((one-zero)%4);
                if(x==4){
                    x=0;
                }
                answer[i]=opponents[x];
            }
            else{
                answer[i]=opponents[0];
            }
        }
        for(int i=0;i<t;i++){
            System.out.println(answer[i]);
        }
    }
}
