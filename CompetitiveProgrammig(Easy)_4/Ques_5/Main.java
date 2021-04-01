package com.company;
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputs[]=new int[3];
        for(int i=0;i<3;i++){
            inputs[i]=sc.nextInt();
        }
        int mat[][]=new int[inputs[0]][inputs[1]];
        for(int i=0;i<inputs[0];i++){
            for(int j=0;j<inputs[1];j++){
                mat[i][j]=sc.nextInt();
            }
        }
        zigzag(mat, inputs[2]);
    }
    static void zigzag(int mat[][], int startIndex){
        int row=mat.length;
        int col = mat[0].length;
        if(startIndex==1){
            int sum = 0;
            for(int i=0;i<row;i++){
                int x=i;
                int y=0;
                while(x+y==sum&&x>=0&&y<col){
                    System.out.print(mat[x][y]+" ");
                    y += 1;
                    x -= 1;
                }
                System.out.println();
                sum += 1;
            }
            for(int j=1;j<col;j++){
                int x=row-1;
                int y=j;
                while(x+y==sum&&x>=0&&y<col){
                    System.out.print(mat[x][y]+" ");
                    x -= 1;
                    y += 1;
                }
                System.out.println();
                sum += 1;
            }
        }
        else if(startIndex==2){
            int diff = col-1;
            for(int i=0;i<row;i++){
                int x=i;
                int y=col-1;
                while(y-x==diff&&x>=0&&y>=0){
                    System.out.print(mat[x][y]+" ");
                    x -= 1;
                    y -= 1;
                }
                System.out.println();
                diff -= 1;
            }
            for(int j = col-2;j>=0;j--){
                int x = row-1;
                int y = j;
                while(y-x==diff&&x>=0&&y>=0){
                    System.out.print(mat[x][y]+" ");
                    x -= 1;
                    y -= 1;
                }
                System.out.println();
                diff -= 1;
            }
        }
        else if(startIndex==3){
            int sum = row+col-2;
            for(int j=col-1;j>=0;j--){
                int x=row-1;
                int y=j;
                while(x+y==sum&&x>=0&&y<col){
                    System.out.print(mat[x][y]+" ");
                    x -= 1;
                    y += 1;
                }
                System.out.println();
                sum -= 1;
            }
            for(int i = row-2;i>=0;i--){
                int x = i;
                int y = 0;
                while(x+y==sum&&x>=0&&y<col){
                    System.out.print(mat[x][y]+" ");
                    x -= 1;
                    y += 1;
                }
                System.out.println();
                sum -= 1;
            }
        }
        else if(startIndex==4){
            int diff = row-1;
            for(int j=0;j<col;j++){
                int x = row-1;
                int y = j;
                while(x-y==diff&x>=0&&y>=0){
                    System.out.print(mat[x][y]+" ");
                    x -= 1;
                    y -= 1;
                }
                System.out.println();
                diff -= 1;
            }
            for(int i=row-2;i>=0;i--){
                int x = i;
                int y = col-1;
                while(x-y==diff&&x>=0&&y>=0){
                    System.out.print(mat[x][y]+" ");
                    x -= 1;
                    y -= 1;
                }
                System.out.println();
                diff -= 1;
            }
        }
    }
}
