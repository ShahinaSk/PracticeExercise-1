package com.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubStringRepeat {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String string=br.readLine();
        int number=Integer.parseInt(br.readLine());
        String sub=string.substring(string.length()-number);
        while(number>0){
            string+=sub;
            number--;
        }

        System.out.println(string);
        br.close();
    }
}
