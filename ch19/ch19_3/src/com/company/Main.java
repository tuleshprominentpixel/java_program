package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int num;
        int divisors;
        int numoftimeDivisors;

        divisors = 1;
        numoftimeDivisors = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter value ");
        num=sc.nextInt();


        for (int i = 0;  i <= num;  i++ ) {

            int j;
            int divisorCount;

            divisorCount = 0;

            for ( j = 1;  j <= i;  j++ ) {
                if ( i % j == 0 )
                    divisorCount++;
            }

            if (divisorCount > divisors) {
                divisors = divisorCount;
                numoftimeDivisors = i;
            }

        }

        System.out.println("Max divisors " + divisors);
        System.out.println("A number with " + divisors + " divisors is " + numoftimeDivisors);
    }
}
