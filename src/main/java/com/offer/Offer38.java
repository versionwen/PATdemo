package com.offer;

/**
 * @author version
 * @version 1.0
 * @date 2020/2/19 21:53
 */
public class Offer38 {
    public boolean Find(int target, int [][] array){
        int lenght=array.length;
        int column=array[0].length-1;
        int row=0;
        int col=column;
        boolean flag=false;
        while(row<lenght&&col>=0){
            if(array[row][col]<target){
                row++;
            }
            else if(array[row][col]>target){
                col--;
            }
            else {
                flag=true;
                return flag;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][]a=new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        Offer38 input=new Offer38();
        boolean out=input.Find(7,a);
        System.out.println(out);
    }
}
