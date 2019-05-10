package com.pe1;

import java.util.Scanner;

public class SumOfInts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] string=scanner.nextLine().split(" ");
        int index=0,sum=0;
        while (index<string.length){
            sum+=Integer.parseInt(string[index++]);

        }
        System.out.print(sum);
        scanner.close();
    }
}
