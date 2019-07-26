package com.other;


import java.io.*;
import java.util.*;
public class friday {

    public static boolean isleapyear(int year)
    {
        if((year%4==0)&&(year%100!=0))
        {
            return true;
        }
        else if(year%400==0)
        {
            return true;
        }else
        {
            return false;
        }


    }
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("D://friday.in")); // input file name goes above
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        int N = Integer.parseInt(f.readLine());
        int	count[]=new int[7];//These array represent the number of times the 13th falls on  Sunday, Monday, Tuesday, ..., Friday,Saturday
        int days=0;//days of one month
        int currentYear=1900;
        int m;
        int allDays=0;
        boolean isLeapYear=false;
        for(int i=0;i<N;i++)
        {

            isLeapYear=isleapyear(currentYear);
            for(int j=1;j<=12;j++)
            {

                switch(j)
                {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days=30;
                        break;
                    case 2:
                        if(isLeapYear)
                        {
                            days=29;
                        }
                        else
                            days=28;
                        break;
                    default:
                        days=31;

                }
                // int a=allDays+1;
                count[(allDays+13)%7]++;
                allDays+=days;

            }


            currentYear++;
        }
        out.print(count[6]+" ");
        for(int i=0;i<5;i++)
            out.print(count[i]+" ");
        out.println(count[5]);
        out.close();  // close the output file
        System.exit(0);
    }

}

