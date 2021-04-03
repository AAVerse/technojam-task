package com.company;
import java.util.*;
class Main{
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n= sc.nextInt();
        String ar[]=new String[n];
        for(int i=0;i<n;i++){
            ar[i]=Leonard();
        }

        for(int i=0;i<n;i++){
            System.out.println(ar[i]);
        }

    }
    static String Leonard(){
        String s = sc.next();
        int l = s.length();
        String substart="";
        String subend="";
        String substart1 = "";
        for(int i = 0;i<l;i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='A'){
                substart = s.substring(0, i);
                subend = s.substring(i);
                break;
            }
        }
        if(substart.equals("")){
            substart=s;
        }

        for(int i=0;i<substart.length();i++){
            char ch=substart.charAt(i);
            substart1 += (char)((int)ch-1);
        }

        return substart1+subend;
    }
}
