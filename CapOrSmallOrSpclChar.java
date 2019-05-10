package com.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CapOrSmallOrSpclChar {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char ch=br.readLine().charAt(0);
        if (Character.isUpperCase(ch)){
            System.out.println("Capital letter");
        }else if (Character.isLowerCase(ch)){
            System.out.println("Small letter");
        }else {
            System.out.println("Special character");
        }
        br.close();
    }
}
