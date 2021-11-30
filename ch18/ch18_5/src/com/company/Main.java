package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;
class arrayException extends RuntimeException
{
    arrayException(){
        System.out.println("ArrayIsFullException :");
    }
}
public class Main {
    static int size,num1;
    public static void main(String[] args) {
	// write your code here
        /*int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array");



        try {
            size=sc.nextInt();
            int arr1[]=new int[size];
            int[] array1 = new int[]{1,5,10};
            printArray(array1);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The array doesn't have more than 3 item!");
        }*/

        System.out.println("Please enter the size of array :");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr1[]=new int[size];
        for (int i=0;i< arr1.length;i++){
            arr1[i]=i;
        }
        System.out.println("Your array value is :");
        for (int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
        try {
            System.out.println("Enter element which you want to access :");
            num1=sc.nextInt();
            arrayCheck(num1);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    static  void arrayCheck(int array1) throws arrayException {
        System.out.println(array1);
        if(num1>size){
            throw new arrayException();
        }

    }

}
