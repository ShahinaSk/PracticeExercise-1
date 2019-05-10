package com.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TomAndJerry {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int number=Integer.parseInt(br.readLine());
        if (number%2!=0 &&number>20 && number<30){
            System.out.println("Tom");
            return;
        }
        if (number%2==0 &&number>20 && number<30){
            System.out.println("Jerry");
            return;
        }
        br.close();
    }

}
