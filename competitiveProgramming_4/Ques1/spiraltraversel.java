package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input[]=new int[4];
        for(int i =0;i<4;i++){
            input[i]=sc.nextInt();
        }
        int n = input[0];
        int m = input[1];
        int a[][] = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int dir = input[2];
        int vertex = input[3];

        int minc = 0;
        int minr = 0;
        int maxc = n-1;
        int maxr = m-1;
        int te = n*m;
        int c = 0;
        while(c<te){
            if(dir == 1){
                if(vertex == 1){
                    //left to right print
                    for(int i=minc;i<=maxc && c<te;i++){
                        System.out.print(a[minr][i]+" ");
                        c++;
                    }
                    minr+=1;

                    //top to bottom print
                    for(int i=minr;i<=maxr && c<te;i++){
                        System.out.print(a[i][maxc]+" ");
                        c++;
                    }
                    maxc-=1;

                    //right to left print
                    for(int i=maxc;i>=minc && c<te;i--){
                        System.out.print(a[maxr][i]+" ");
                        c++;
                    }
                    maxr-=1;

                    //bottom to top print
                    for(int i=maxr;i>=minr && c<te;i--){
                        System.out.print(a[i][minc]+" ");
                        c++;
                    }
                    minc+=1;
                }
                else if(vertex==2){
                    //top to bottom print
                    for(int i=minr;i<=maxr && c<te;i++){
                        System.out.print(a[i][maxc]+" ");
                        c++;
                    }
                    maxc-=1;

                    //right to left print
                    for(int i=maxc;i>=minc && c<te;i--){
                        System.out.print(a[maxr][i]+" ");
                        c++;
                    }
                    maxr-=1;

                    //bottom to top print
                    for(int i=maxr;i>=minr && c<te;i--){
                        System.out.print(a[i][minc]+" ");
                        c++;
                    }
                    minc+=1;

                    //left to right print
                    for(int i=minc;i<=maxc && c<te;i++){
                        System.out.print(a[minr][i]+" ");
                        c++;
                    }
                    minr+=1;
                }
                else if(vertex==3){
                    //right to left print
                    for(int i=maxc;i>=minc && c<te;i--){
                        System.out.print(a[maxr][i]+" ");
                        c++;
                    }
                    maxr-=1;

                    //bottom to top print
                    for(int i=maxr;i>=minr && c<te;i--){
                        System.out.print(a[i][minc]+" ");
                        c++;
                    }
                    minc+=1;

                    //left to right print
                    for(int i=minc;i<=maxc && c<te;i++){
                        System.out.print(a[minr][i]+" ");
                        c++;
                    }
                    minr+=1;

                    //top to bottom print
                    for(int i=minr;i<=maxr && c<te;i++){
                        System.out.print(a[i][maxc]+" ");
                        c++;
                    }
                    maxc-=1;
                }
                else if(vertex==4){
                    //bottom to top print
                    for(int i=maxr;i>=minr && c<te;i--){
                        System.out.print(a[i][minc]+" ");
                        c++;
                    }
                    minc+=1;

                    //left to right print
                    for(int i=minc;i<=maxc && c<te;i++){
                        System.out.print(a[minr][i]+" ");
                        c++;
                    }
                    minr+=1;

                    //top to bottom print
                    for(int i=minr;i<=maxr && c<te;i++){
                        System.out.print(a[i][maxc]+" ");
                        c++;
                    }
                    maxc-=1;

                    //right to left print
                    for(int i=maxc;i>=minc && c<te;i--){
                        System.out.print(a[maxr][i]+" ");
                        c++;
                    }
                    maxr-=1;
                }
            }
            else if(dir==2){
                if(vertex==1){
                    //top to bottom print
                    for(int i=minr;i<=maxr && c<te;i++){
                        System.out.print(a[i][minc]+" ");
                        c++;
                    }
                    minc+=1;

                    //left to right print
                    for(int i=minc;i<=maxc && c<te;i++){
                        System.out.print(a[maxr][i]+" ");
                        c++;
                    }
                    maxr-=1;

                    //bottom to top print
                    for(int i=maxr;i>=minr && c<te;i--){
                        System.out.print(a[i][maxc]+" ");
                        c++;
                    }
                    maxc-=1;

                    //right to left print
                    for(int i=maxc;i>=minc && c<te;i--){
                        System.out.print(a[minr][i]+" ");
                        c++;
                    }
                    minr+=1;
                }
                else if(vertex==2){
                    //right to left print
                    for(int i=maxc;i>=minc && c<te;i--){
                        System.out.print(a[minr][i]+" ");
                        c++;
                    }
                    minr+=1;

                    //top to bottom print
                    for(int i=minr;i<=maxr && c<te;i++){
                        System.out.print(a[i][minc]+" ");
                        c++;
                    }
                    minc+=1;

                    //left to right print
                    for(int i=minc;i<=maxc && c<te;i++){
                        System.out.print(a[maxr][i]+" ");
                        c++;
                    }
                    maxr-=1;

                    //bottom to top print
                    for(int i=maxr;i>=minr && c<te;i--){
                        System.out.print(a[i][maxc]+" ");
                        c++;
                    }
                    maxc-=1;
                }
                else if(vertex==3){
                    //bottom to top print
                    for(int i=maxr;i>=minr && c<te;i--){
                        System.out.print(a[i][maxc]+" ");
                        c++;
                    }
                    maxc-=1;

                    //right to left print
                    for(int i=maxc;i>=minc && c<te;i--){
                        System.out.print(a[minr][i]+" ");
                        c++;
                    }
                    minr+=1;

                    //top to bottom print
                    for(int i=minr;i<=maxr && c<te;i++){
                        System.out.print(a[i][minc]+" ");
                        c++;
                    }
                    minc+=1;

                    //left to right print
                    for(int i=minc;i<=maxc && c<te;i++){
                        System.out.print(a[maxr][i]+" ");
                        c++;
                    }
                    maxr-=1;
                }
                else if(vertex==4){
                    //left to right print
                    for(int i=minc;i<=maxc && c<te;i++){
                        System.out.print(a[maxr][i]+" ");
                        c++;
                    }
                    maxr-=1;

                    //bottom to top print
                    for(int i=maxr;i>=minr && c<te;i--){
                        System.out.print(a[i][maxc]+" ");
                        c++;
                    }
                    maxc-=1;

                    //right to left print
                    for(int i=maxc;i>=minc && c<te;i--){
                        System.out.print(a[minr][i]+" ");
                        c++;
                    }
                    minr+=1;

                    //top to bottom print
                    for(int i=minr;i<=maxr && c<te;i++){
                        System.out.print(a[i][minc]+" ");
                        c++;
                    }
                    minc+=1;
                }
            }
        }
    }
}

