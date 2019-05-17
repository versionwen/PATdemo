package com.learnjava;

import java.util.Scanner;

public class patTwo {
        public static String output(int count){
            switch (count)
            {
                case 0:
                    return "ling";
                case 1:
                    return("yi");
                case 2:
                    return("er");
                case 3:
                    return("san");
                case 4:
                    return("si");
                case 5:
                    return("wu");
                case 6:
                    return("liu");
                case 7:
                    return("qi");
                case 8:
                    return("ba");
                case 9:
                    return("jiu");
            }
            return null;
        }
    public static void main(String[] args) {
        int result=0;
        Scanner input=new Scanner(System.in);
        String num=input.nextLine();
        for (int i=0;i<num.length();i++) {
            result = result + Integer.parseInt(num.charAt(i) + "");
        }
        //returnln(result);
        String temp=result+"";
        for(int j=0;j<temp.length();j++){
            if (j<temp.length()-1)
            System.out.print(output(Integer.parseInt(temp.charAt(j)+""))+" ");
            else
                System.out.print(output(Integer.parseInt(temp.charAt(j)+"")));
        }
    }
}
