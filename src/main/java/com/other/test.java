package com.other;
/*
ID: your_id_here
LANG: JAVA
TASK: test
*/
import java.io.*;
import java.util.*;

class test {
    public static void main (String [] args) throws IOException {
        int[][][][]f=new int[10][10][10][10];//每种商品购买一定数量的价钱
        int m,b,z,x,y,w;//方案总数，商品总数
        int[]bk=new int[1100];
        int[]n=new int[6];//每种需要的个数
        BufferedReader file = new BufferedReader(new FileReader("test.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
        StringTokenizer st = new StringTokenizer(file.readLine());
        int i1 = Integer.parseInt(st.nextToken());
        int i2 = Integer.parseInt(st.nextToken());
        out.println(i1+i2);
        out.close();
    }
}
class node{
    int s,p;
    int[]t= new int[6];
}