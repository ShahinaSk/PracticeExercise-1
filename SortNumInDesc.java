package com.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortNumInDesc {
    public static void main(String[] args)  throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int number=Integer.parseInt(br.readLine());
        System.out.println("Sorted number in non-increasing order : "+revSortNum(number));
        long res=calculateEvenSum(number);
        System.out.println("Sum of even numbers : "+(res)+"\n"+(res>15));

        br.close();
    }
    public static String revSortNum(int number){
        String[] s=String.valueOf(number).split("");
        Arrays.sort(s,Collections.reverseOrder());
        String str = Arrays.toString(s);
        str=str.substring(1, str.length()-1).replace(", ", "");

        return str;
    }

    public static long calculateEvenSum(long num) {
        int rem=0,sum=0;
        while (num>0){
            rem=(int)num%10;
            if (rem%2==0){
                sum+=rem;
                System.out.print(sum+" ");
            }
            num=num/10;
        }
        return sum;
    }


}
