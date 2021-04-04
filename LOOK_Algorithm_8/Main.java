package com.company;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter initial head position");
        int head = sc.nextInt();
        System.out.println("Enter direction");
        String dir = sc.next();

        Look(ar, head, dir, size);
    }
    static void Look(int ar[], int head, String dir, int size){
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        List<Integer> seq = new ArrayList<Integer>();
        int seekCount = 0;
        for(int i=0;i<size;i++){
            if(ar[i]<head){
                left.add(ar[i]);
            }
            else{
                right.add(ar[i]);
            }
        }
        Collections.sort(left);
        Collections.sort(right);

        for(int i=0;i<2;i++){
            if(dir.equalsIgnoreCase("left")){
                for(int j=left.size()-1;j>=0;j--){
                    int x = left.get(j);
                    seq.add(x);
                    seekCount += head-x;
                    head=x;
                }
                dir = "right";
            }
            else if(dir.equalsIgnoreCase("right")){
                for(int j=0;j<right.size();j++){
                    int x = right.get(j);
                    seq.add(x);
                    seekCount += x-head;
                    head =x;
                }
                dir = "left";
            }
        }
        System.out.println("Seek Sequence");
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
        System.out.println("Seek Count: "+seekCount);
    }
}
