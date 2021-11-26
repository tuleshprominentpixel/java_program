package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int expecteddd, expectedmm, expectedyyyy, actualdd, actualmm, actualyyyy;
        /*String fine = "";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter expected date , month and year");
        expecteddd=sc.nextInt();
        expectedmm=sc.nextInt();
        expectedyyyy=sc.nextInt();
        System.out.println("Enter actual date , month and year");
        actualdd=sc.nextInt();
        actualmm=sc.nextInt();
        actualyyyy=sc.nextInt();

        if(actualyyyy>expectedyyyy){
            fine=" you have late fine more than 1 year so your fine is :"+10000;
        }
        else if(actualmm<expectedmm | actualyyyy<expectedyyyy | (actualmm==expectedmm)&&(expectedmm==actualdd)){
            fine=0+"You submited book on time";
        }
        else  if(actualmm==expectedmm){
            fine="You submited book "+(actualdd - expecteddd)+" days late, so Your fine to be paid is :"+(15 * (actualdd - expecteddd));

        }
        else{
            fine="You submited book "+(actualmm - expectedmm)+" month late, so Your fine to be paid is :"+(500 * (actualmm - expectedmm));

        }
        System.out.println(fine);*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter expected date");
        int i;
        int expected[]=new int[100];
        String  fine="";
        String s[]= scan.nextLine().split(" ");
        for(i =0 ;i < s.length;i++){
            expected[i]= Integer.parseInt(s[i]);

        }
        for(i =0 ;i < s.length;i++) {
            {
                if((expected[0]<1)||(expected[0]>31))
                {
                    System.out.println("please enter proper date");
                    break;
                }
                if((expected[1]<1)||(expected[1]>12))
                {
                    System.out.println("please enter proper Month");
                    break;
                }
                if((expected[2]<1900)||(expected[2]>9999))
                {
                    System.out.println("please enter proper year");
                    break;
                }

            }
//            System.out.println(expected[i]);
        }
        System.out.println("Please enter actual date");
        int actual[]=new int[100];
        String s2[]= scan.nextLine().split(" ");
        for(i =0 ;i < s2.length;i++){
            actual[i]= Integer.parseInt(s2[i]);
        }
        for(i =0 ;i < s2.length;i++) {
            if((actual[0]<1)||(actual[0]>31))
            {
                System.out.println("please enter proper date");
                break;
            }
            if((actual[1]<1)||(actual[1]>12))
            {
                System.out.println("please enter proper Month");
                break;
            }
            if((actual[2]<1900)||(actual[2]>9999))
            {
                System.out.println("please enter proper year");
                break;
            }
//            System.out.println(actual[i]);
        }
        if(actual[2]>expected[2]){
            fine=" you have late fine more than 1 year so your fine is :"+10000;
        }
        else if(actual[1]<expected[1] | actual[2]<expected[2] | (actual[1]==expected[1])&&(actual[0]<=expected[0])){
            fine=0+"You submited book on time.Thanks you";
        }
        else  if(actual[1]==expected[1]){
            fine="You submit book "+(actual[0] - expected[0])+" days late, so Your fine to  paid is :"+(15 * (actual[0] - expected[0]));
        }
        else{
            fine="You submit book "+(actual[1] - expected[1])+" month late, so Your fine to be paid is :"+(500 * (actual[1] - expected[1]));
        }
        System.out.println(fine);

    }
}
