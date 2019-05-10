package com.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringReverse {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String string=br.readLine();
        System.out.println(stringReverse(string));
        br.close();
    }
    public static String stringReverse(String string){
        String result="";
        int index=string.length()-1;
        while(index>=0){
            result+=string.substring(index,index+1);
            index--;
        }
        return result;
    }

}
