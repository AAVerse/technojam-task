package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no.of students");
        int n=scanner.nextInt();
        List<Student> studentList=new ArrayList<Student>();
        String ar[][]=new String[n][7];
        for(int i=0;i<n;i++){
            for(int j=0;j<7;j++){
                ar[i][j]=scanner.next();
            }
            String name = ar[i][0];
            int adm = Integer.parseInt(ar[i][1]);
            int phy = Integer.parseInt(ar[i][2]);
            int chem = Integer.parseInt(ar[i][3]);
            int math = Integer.parseInt(ar[i][4]);
            int eng = Integer.parseInt(ar[i][5]);
            int cse = Integer.parseInt(ar[i][6]);
            int total=sum(phy,chem,math,eng,cse);
            int pcm=sum(phy,chem,math,0,0);
            Student student =new Student(total,pcm,name,adm);
            studentList.add(student);
        }
        Collections.sort(studentList);
        for(Student s: studentList){
            System.out.println(s.getName() + " " + s.getadm());
        }
    }
    public static int sum(int a, int b, int c, int d, int e){
        return a+b+c+d+e;
    }
}


