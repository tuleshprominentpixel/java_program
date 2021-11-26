package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix : ");
        num=sc.nextInt();
        int arr1[][]=new int[num][num];

        for(int i=0;i< arr1.length;i++)
        {
            count=i+1;
            for (int j=0;j< arr1[0].length;j++)
            {

                arr1[i][j]=count;
                if(j==2){
                    count+=6;
                }else {
                count+=5;
                }
            }
        }
        System.out.println("Print array : ");
        for(int i=0;i< arr1.length;i++)
        {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Print first row");
        for(int i=0;i< 1;i++)
        {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j]+" ");
            }
        }
        System.out.println("");
        System.out.println("------------------");
        System.out.println("Print second column");
        for(int i=0;i< arr1.length;i++)
        {
            for (int j = 1; j < 2; j++) {
                System.out.print(arr1[i][j]+" ");
            }
        }
        System.out.println("");
        System.out.println("------------------");
        System.out.println(" horizontal diagonal bottom-right to top-left");
        for(int i=arr1.length;i>=0 ;i--)
        {
            for (int j = 0; j < arr1[0].length; j++) {
                if(i==j){
                System.out.print(arr1[i][j]+" ");}
            }
        }
        System.out.println("");
        System.out.println("------------------");
        System.out.println(" horizontal diagonal top-right to bottom-left ");
        count= arr1.length-1;
        for(int i=0;i< arr1.length ;i++)
        {
            for (int j = arr1[0].length-1; j>=0 ; j--) {
                if(count==j){
                System.out.print(arr1[i][j]+" ");

                }
            }
            count--;
        }
    }
}
