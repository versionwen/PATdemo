package com.learnjava;

import java.util.Scanner;

public class patFour {
    private String name;
    private String xh;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        patFour max=new patFour();
        max.setGrade(-1);
        patFour min=new patFour();
        min.setGrade(101);
        Scanner input=new Scanner(System.in);
        int count=input.nextInt();
        for(int i=0;i<count;i++){
            patFour temp=new patFour();
            Scanner userInput=new Scanner(System.in);
            String in=userInput.nextLine();
            String inTemp[]=in.split(" ");
            String name=inTemp[0];
            String xh=inTemp[1];
            int cj=Integer.parseInt(inTemp[2]);
            if(cj>max.getGrade()){
                max.setName(name);
                max.setXh(xh);
                max.setGrade(cj);
            }
            if(cj<min.getGrade()){
                min.setName(name);
                min.setXh(xh);
                min.setGrade(cj);
            }
        }
        System.out.println(max.getName()+" "+max.getXh());
        System.out.print(min.getName()+" "+min.getXh());
    }
}
