package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num1;
        System.out.print("Enter any number : ");
        Scanner sc=new Scanner(System.in);

        try {

            num1=sc.nextInt();
            if(num1>65000) {
                throw new ArithmeticException("Invalid Elasticsearch port configuration.");
            }
            else {
                System.out.println("Right input");
            }
        }
        catch(NumberFormatException e)
        {
            //If number is not integer,you wil get exception and exception message will be printed
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Invalid Elasticsearch port configuration.");
        }
    }
}
