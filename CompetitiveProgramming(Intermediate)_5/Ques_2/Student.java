package com.company;

public class Student implements Comparable {
    private int total;
    private int pcm;
    private String name;
    private int adm;


    public Student(int total, int pcm, String name,int adm) {
        this.total = total;
        this.pcm = pcm;
        this.name = name;
        this.adm=adm;
    }

    public String getName() {
        return name;
    }
    public int getadm(){
        return adm;
    }

    public int compareTo(Object ob){
        Student s=(Student) ob ;
        if(total==s.total){
            if(pcm==s.pcm){
                if(name.equalsIgnoreCase(s.name)){
                    return adm=s.adm;
                }
                else{
                    name.compareTo(s.name);
                }
            }
            else{
                if((s.pcm-pcm)>0){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        }
        else{
            if((s.total-total)>0){
                return 1;
            }
            else{
                return -1;
            }
        }
        return 0;
    }
}
