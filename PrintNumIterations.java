package com.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintNumIterations {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int number=Integer.parseInt(br.readLine());
        int index=1,count=1;
        while (index<=number){
            count=1;
            while (count<=index){
                System.out.print(index+" ");
                count++;
            }
            index++;
        }
        br.close();
    }
}
