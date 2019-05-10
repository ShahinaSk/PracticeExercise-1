package com.pe1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        long sum=0;
        if (string.equals(new StringBuffer(string).reverse().toString())) {
            if (calculateEvenSum(Long.parseLong(string),sum) > 25) {
                System.out.println(string + " is palindrome and the sum of even numbers is greater than 25");
                return;
            }
            System.out.println(string + " is palindrome and the sum of even numbers is less than 25");
            return;
        }
        System.out.println(string + " is not palindrome");
        br.close();
    }

    public static long calculateEvenSum(long num,long sum) {
        int rem=0;
        while (num>0){
            rem=(int)num%10;
            if (rem%2==0){
                sum+=rem;
            }
            num=num/10;
        }
        return sum;
    }
}