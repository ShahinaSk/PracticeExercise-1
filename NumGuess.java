package com.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumGuess {

    public static void main(String[] args) throws Exception{
        int num=35;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Guess a number between 1-50");
        int input=0;
       do{
           input=Integer.parseInt(br.readLine());
           if (input>num){
               System.out.println("Number guessed is more than original number! Try Again");
           }else if (input<num){
               System.out.println("Number guessed is less than original number! Try Again");
           }
       }while (input!=num);
       System.out.println("Number guessed matches the original number");
        br.close();
    }


}
