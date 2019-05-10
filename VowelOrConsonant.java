package com.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VowelOrConsonant {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] strings=br.readLine().split("");
        int index=0;
        while(index<strings.length){

                if (strings[index].matches("[aeiouAEIOU]")){
                    System.out.print("Vowel ");
                }else if (strings[index].matches("[b-zB-Z&&[^eiouEIOU]]")){
                    System.out.print("Consonant ");
                }else {
                    System.out.println("Not a letter!!!");
                }

            index++;
        }
        br.close();
    }
}
